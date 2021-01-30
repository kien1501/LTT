/**
 * 
 */

/*======================== 
        Fashion Store Slider 
   ==========================*/
   if ($('#fashion-store-slider').length > 0) {
    $('#fashion-store-slider').owlCarousel({
        loop: true,
        items: 5,
        dots: false,
        nav: true,
        autoplayTimeout: 10000,
        autoplay: true,
        animateOut: 'slideOutLeft',
        autoplayHoverPause: true,
        mouseDrag: false,
        touchDrag:true,
        navText: [
        "<img src='img/icon/left-arrow-block-2.svg' >", 
        "<img src='img/icon/right-arrow-block-2.svg' >"
        ],
            responsive: {
                // breakpoint from 0 up
                0: {
                    items: 3,
                },
                // breakpoint from 480 up
                480: {
                    items: 4,
                },
                // breakpoint from 768 up
                768: {
                    items: 5,
                },
                // breakpoint from 768 up
                1200: {
                    items: 5,
                }
            }
    });
}

/*======================== 
        Blog List Slider 
   ==========================*/
   if ($('#blog-list-slider').length > 0) {
    $('#blog-list-slider').owlCarousel({
        loop: true,
        items: 5,
        dots: false,
        nav: true,
        autoplayTimeout: 10000,
        autoplay: true,
        animateOut: 'slideOutLeft',
        autoplayHoverPause: true,
        mouseDrag: false,
        touchDrag:true,
        navText: [
        "<img src='img/icon/left-arrow-block-2.svg' >", 
        "<img src='img/icon/right-arrow-block-2.svg' >"
        ],
            responsive: {
                // breakpoint from 0 up
                0: {
                    items: 3,
                },
                // breakpoint from 480 up
                480: {
                    items: 4,
                },
                // breakpoint from 768 up
                768: {
                    items: 5,
                },
                // breakpoint from 768 up
                1200: {
                    items: 5,
                }
            }
    });
}
