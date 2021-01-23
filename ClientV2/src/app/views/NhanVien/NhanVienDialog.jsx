import React, { Component } from "react";
import {
  Dialog,
  Button,
  Grid,
  DialogActions,
  FormControl,
  Paper,
  DialogTitle,
  DialogContent,
  InputLabel,
  Select,
  MenuItem
} from "@material-ui/core";
// import Paper from '@material-ui/core/Paper'
import { ValidatorForm, TextValidator } from "react-material-ui-form-validator";
import Draggable from "react-draggable";
import NotificationPopup from "../Component/NotificationPopup/NotificationPopup";
import {
  addNewUrbanArea,
  updateUrbanArea,
  checkCode,
} from "./NhanVienService";
import { toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

toast.configure({
  autoClose: 2000,
  draggable: false,
  limit: 3,
});

function PaperComponent(props) {
  return (
    <Draggable
      handle="#draggable-dialog-title"
      cancel={'[class*="MuiDialogContent-root"]'}
    >
      <Paper {...props} />
    </Draggable>
  );
}

class UrbanAreaDialog extends Component {
  state = {
    id: "",
    code: "",
    type: "",
    displayName: "",
    type: "",
    email:"",
    phoneNumber:"",
    shouldOpenNotificationPopup: false,
    Notification: "",
  };
  listType = [
    { id: 1, name: 'Nhân viên bán hàng' },
    { id: 2, name: 'Nhân viên thu ngân' },
    { id: 3, name: 'Khác' }
  ]
  handleDialogClose = () => {
    this.setState({ shouldOpenNotificationPopup: false });
  };

  handleChange = (event, source) => {
    event.persist();
    if (source === "switch") {
      this.setState({ isActive: event.target.checked });
      return;
    }
    this.setState({
      [event.target.name]: event.target.value,
    });
    if (source === "type") {
      let { type } = this.state;
      type = event.target.value;
      this.setState({ type: type });
      return;
    }
  };

  handleFormSubmit = () => {
    let { id } = this.state;
    let { code } = this.state;
    var { t } = this.props;
    checkCode(id, code).then((result) => {
      //Nếu trả về true là code đã được sử dụng
      if (result.data) {
        toast.warning("Mã nhân viên đã sử dụng, vui lòng điền một mã khác.");
        
        // alert("Code đã được sử dụng");
      } else {
        //Nếu trả về false là code chưa sử dụng có thể dùng
        if (id) {
          updateUrbanArea({
            ...this.state,
          }).then(() => {
            toast.success("Cập nhật thành công thông tin nhân viên");
            this.props.handleOKEditClose();
          });
        } else {
          addNewUrbanArea({
            ...this.state,
          }).then(() => {
            toast.success("Thêm mới thành công nhân viên");
            this.props.handleOKEditClose();
          });
        }
      }
    });
  };

  componentWillMount() {
    //getUserById(this.props.uid).then(data => this.setState({ ...data.data }));
    let { open, handleClose, item } = this.props;
    this.setState(item);
  }

  render() {
    let {
      id,
      code,
      type,
      displayName,
      email,
      phoneNumber,
      shouldOpenNotificationPopup,
    } = this.state;
    let { open, handleClose, handleOKEditClose, t, i18n } = this.props;
    return (
      <Dialog
        open={open}
        PaperComponent={PaperComponent}
        maxWidth="sm"
        fullWidth
      >
        <DialogTitle
          style={{ cursor: "move", paddingBottom: "0px" }}
          id="draggable-dialog-title"
        >
          <h4 className="">{id ? (<span>Sửa thông tin nhân viên</span>) : (<span>Thêm nhân viên</span>)}</h4>
        </DialogTitle>
        <ValidatorForm ref="form" onSubmit={this.handleFormSubmit}>
          <DialogContent>
            <Grid className="" container spacing={2}>
              <Grid item sm={12} xs={12}>
                <TextValidator
                  className="w-100 "
                  label={
                    <span>
                      <span style={{ color: "red" }}>*</span>
                      {t("general.code")}
                    </span>
                  }
                  onChange={this.handleChange}
                  type="text"
                  name="code"
                  value={code}
                  validators={["required"]}
                  errorMessages={[t("general.required")]}
                />
              </Grid>
              <Grid item sm={12} xs={12}>
                <TextValidator
                  className="w-100 "
                  label={
                    <span>
                      <span style={{ color: "red" }}>*</span>
                      {t("general.name")}
                    </span>
                  }
                  onChange={this.handleChange}
                  type="text"
                  name="displayName"
                  value={displayName}
                  validators={["required"]}
                  errorMessages={[t("general.required")]}
                />
              </Grid>
              <Grid item sm={12} xs={12}>
                <TextValidator
                  className="w-100 "
                  label={
                    <span>
                      <span style={{ color: "red" }}>*</span>
                      Điện thoại liên hệ
                    </span>
                  }
                  onChange={this.handleChange}
                  type="number"
                  name="phoneNumber"
                  value={phoneNumber}
                  validators={["required"]}
                  errorMessages={[t("general.required")]}
                />
              </Grid>
              <Grid item sm={12} xs={12}>
                <TextValidator
                  className="w-100 "
                  label={
                    <span>
                      <span style={{ color: "red" }}>*</span>
                      Email
                    </span>
                  }
                  onChange={this.handleChange}
                  type="email"
                  name="email"
                  value={email}
                  validators={["required"]}
                  errorMessages={[t("general.required")]}
                />
              </Grid>
              <Grid item md={12} sm={12} xs={12} className="mt-10">
                <FormControl fullWidth={true} variant="outlined"
                  size="small">
                  <InputLabel htmlFor="gender-simple">{<span className="font"><span style={{ color: "red" }}>*</span>Loại nhân viên</span>}</InputLabel>
                  <Select
                    value={type}
                    onChange={type => this.handleChange(type, "type")}
                    inputProps={{
                      name: "gender",
                      id: "gender-simple"
                    }}
                  >
                    {this.listType.map(item => {
                      return <MenuItem key={item.id} value={item.id}>{item.name}</MenuItem>;
                    })}
                  </Select>
                </FormControl>
              </Grid>
            </Grid>
          </DialogContent>
          <DialogActions>
            <div className="flex flex-space-between flex-middle mt-12">
              <Button
                variant="contained"
                className="mr-12"
                color="secondary"
                onClick={() => this.props.handleClose()}
              >
                {t("general.cancel")}
              </Button>
              <Button
                variant="contained"
                style={{ marginRight: "15px" }}
                color="primary"
                type="submit"
              >
                {t("general.save")}
              </Button>
            </div>
          </DialogActions>
        </ValidatorForm>
      </Dialog>
    );
  }
}

export default UrbanAreaDialog;
