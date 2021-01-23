package com.globits.da.rest;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globits.da.dto.SearchShiftWorkDto;
import com.globits.da.dto.ShiftWorkDto;
import com.globits.da.dto.search.SearchDto;
import com.globits.da.service.ShiftWorkService;

@RestController
@RequestMapping("/api/shiftwork")
public class RestShiftWorkController {
	@Autowired
	ShiftWorkService shiftWorkService;

//	@Secured({ HrConstants.ROLE_HR_MANAGEMENT, Constants.ROLE_ADMIN })
	@RequestMapping(value = "/{pageIndex}/{pageSize}", method = RequestMethod.GET)
	public ResponseEntity<Page<ShiftWorkDto>> getPage(@PathVariable int pageIndex, @PathVariable int pageSize) {
		Page<ShiftWorkDto> results = shiftWorkService.getPage(pageSize, pageIndex);
		return new ResponseEntity<Page<ShiftWorkDto>>(results, HttpStatus.OK);
	}

//	@Secured({ HrConstants.ROLE_HR_MANAGEMENT, Constants.ROLE_ADMIN })
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<ShiftWorkDto> saveShiftWork(@RequestBody ShiftWorkDto dto) {
		ShiftWorkDto result = shiftWorkService.saveShiftWork(dto);
		return new ResponseEntity<ShiftWorkDto>(result, HttpStatus.OK);
	}

//	@Secured({ HrConstants.ROLE_HR_MANAGEMENT, Constants.ROLE_ADMIN })
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ShiftWorkDto> getShiftWork(@PathVariable UUID id) {
		ShiftWorkDto result = shiftWorkService.getShiftWork(id);
		return new ResponseEntity<ShiftWorkDto>(result, HttpStatus.OK);
	}

//	@Secured({ HrConstants.ROLE_HR_MANAGEMENT, Constants.ROLE_ADMIN })
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Integer> saveShiftWork(@RequestBody List<ShiftWorkDto> dtos) {
		int result = shiftWorkService.deleteShiftWorks(dtos);
		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}

//	@Secured({ HrConstants.ROLE_HR_MANAGEMENT, Constants.ROLE_ADMIN })
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteShiftWork(@PathVariable UUID id) {
		Boolean result = shiftWorkService.deleteShiftWork(id);
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}

//	@Secured({ HrConstants.ROLE_HR_MANAGEMENT, Constants.ROLE_ADMIN })
	@RequestMapping(value = "search/{pageIndex}/{pageSize}", method = RequestMethod.POST)
	public ResponseEntity<Page<ShiftWorkDto>> searchShiftWork(@RequestBody SearchShiftWorkDto dto,
			@PathVariable int pageIndex, @PathVariable int pageSize) {
		Page<ShiftWorkDto> result = shiftWorkService.searchShiftWork(dto, pageIndex, pageSize);
		return new ResponseEntity<Page<ShiftWorkDto>>(result, HttpStatus.OK);
	}

////	@Secured({ HrConstants.ROLE_HR_MANAGEMENT, Constants.ROLE_ADMIN })
//	@RequestMapping(value = "viewlist", method = RequestMethod.GET)
//	public ResponseEntity<List<ViewOrderDto>> getListViewColumns() {
//		ArrayList<ViewOrderDto> result = new ArrayList<ViewOrderDto>();
//
//		ViewOrderDto dto = new ViewOrderDto();
//		dto.setTitle("Thao tác");
//		dto.setField("''");
//		dto.setCellStyle("_cellNowrap");
//		dto.setFormatter("_tableOperation");
//		result.add(dto);
//
//		dto = new ViewOrderDto();
//		dto.setCellStyle("_cellNowrap");
//		dto.setTitle("Mã ca làm việc");
//		dto.setField("code");
//		result.add(dto);
//
//		dto = new ViewOrderDto();
//		dto.setTitle("Tên ca làm việc");
//		dto.setField("name");
//		dto.setCellStyle("_cellNowrap");
//		result.add(dto);
//
//		return new ResponseEntity<List<ViewOrderDto>>(result, HttpStatus.OK);
//
//	}
//	@Secured({ HrConstants.ROLE_HR_MANAGEMENT, Constants.ROLE_ADMIN })
	@RequestMapping(value="/searchByPage", method = RequestMethod.POST)
	public ResponseEntity<Page<ShiftWorkDto>> searchByPage(@RequestBody SearchDto searchDto) {
		Page<ShiftWorkDto> page =  this.shiftWorkService.searchByPage(searchDto);
		return new ResponseEntity<Page<ShiftWorkDto>>(page, HttpStatus.OK);
	}

}
