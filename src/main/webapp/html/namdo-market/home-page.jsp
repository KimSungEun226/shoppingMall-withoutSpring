<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
  <!-- Title -->
  <title>Namdo Market Home Page | Unify - Responsive Website Template</title>

  <!-- Required Meta Tags Always Come First -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">

  <!-- Favicon -->
  <link rel="shortcut icon" href="../favicon.ico">

  <!-- Google Fonts -->
  <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700,900">

  <!-- CSS Global Compulsory -->
  <link rel="stylesheet" href="../assets/vendor/bootstrap/bootstrap.min.css">

  <!-- CSS Implementing Plugins -->
  <link rel="stylesheet" href="../assets/vendor/icon-awesome/css/font-awesome.min.css">
  <link rel="stylesheet" href="../assets/vendor/icon-line-pro/style.css">
  <link rel="stylesheet" href="../assets/vendor/slick-carousel/slick/slick.css">
  <link rel="stylesheet" href="../assets/vendor/icon-hs/style.css">
  <link rel="stylesheet" href="../assets/vendor/animate.css">
  <link rel="stylesheet" href="../assets/vendor/hamburgers/hamburgers.min.css">
  <link rel="stylesheet" href="../assets/vendor/hs-megamenu/src/hs.megamenu.css">
  <link rel="stylesheet" href="../assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.min.css">
    
  <!-- Revolution Slider -->
  <link rel="stylesheet" href="../assets/vendor/revolution-slider/revolution/fonts/pe-icon-7-stroke/css/pe-icon-7-stroke.css">
  <link rel="stylesheet" href="../assets/vendor/revolution-slider/revolution/css/settings.css">
  <link rel="stylesheet" href="../assets/vendor/revolution-slider/revolution/css/layers.css">
  <link rel="stylesheet" href="../assets/vendor/revolution-slider/revolution/css/navigation.css">

  <!-- CSS Unify Theme -->
  <link rel="stylesheet" href="assets/css/styles.e-commerce.css">

  <!-- CSS Customization -->
  <link rel="stylesheet" href="../assets/css/custom.css">
</head>
<body>
  <main>
      <!-- Header -->
      <c:if test="${sessionScope.customerDTO==null && sessionScope.sellerDTO==null && sessionScope.adminDTO==null}">
        <jsp:include page="common/header-main.jsp"/>
      </c:if>

      <c:if test="${sessionScope.customerDTO!=null}">
      <jsp:include page="common/customer-header-main.jsp"/>
      </c:if>

      <c:if test="${sessionScope.sellerDTO!=null}">
        <jsp:include page="common/seller-header-main.jsp"/>
      </c:if>

      <c:if test="${sessionScope.adminDTO!=null}">
        <jsp:include page="common/admin-header-main.jsp"/>
      </c:if>


      <!-- Revolution Slider -->
      <div class="g-overflow-hidden">
        <div id="rev_slider_1086_1_wrapper" class="rev_slider_wrapper fullwidthbanner-container" data-alias="woobig1" data-source="gallery" style="margin:0px auto;background-color:transparent;padding:0px;margin-top:0px;margin-bottom:0px;">
          <!-- START REVOLUTION SLIDER 5.4.1 auto mode -->
          <div id="rev_slider_1086_1" class="rev_slider fullwidthabanner" style="display:none;" data-version="5.4.1">
            <ul>    <!-- SLIDE  -->
              <li data-index="rs-3076" data-transition="slideremovehorizontal" data-slotamount="default" data-hideafterloop="0" data-hideslideonmobile="off" data-easein="default" data-easeout="default" data-masterspeed="default" data-thumb="assets/img-temp/1920x1080/img5.jpg" data-rotate="0" data-fstransition="fade" data-fsmasterspeed="1000" data-fsslotamount="7" data-saveperformance="off" data-title="Slide" data-param1="" data-param2="" data-param3="" data-param4="" data-param5="" data-param6="" data-param7="" data-param8="" data-param9="" data-param10="" data-description="">
                <!-- MAIN IMAGE -->
                <img src="assets/img/bg/secondary.png" alt="Image description" data-lazyload="assets/img-temp/1920x1080/img5.jpg" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="5" class="rev-slidebg">
                <!-- LAYERS -->

              </li>
              <!-- SLIDE  -->
              <li data-index="rs-3077" data-transition="slideremovehorizontal" data-slotamount="default" data-hideafterloop="0" data-hideslideonmobile="off" data-easein="default" data-easeout="default" data-masterspeed="default" data-thumb="assets/img-temp/1920x1080/img6.jpg" data-rotate="0" data-saveperformance="off" data-title="Slide" data-param1="" data-param2="" data-param3="" data-param4="" data-param5="" data-param6="" data-param7="" data-param8="" data-param9="" data-param10="" data-description="">
                <!-- MAIN IMAGE -->
                <img src="assets/img/bg/secondary.png" alt="Image description" data-lazyload="assets/img-temp/1920x1080/img6.jpg" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="5" class="rev-slidebg">
                <!-- LAYERS -->

                
              </li>
              <!-- SLIDE  -->
              <li data-index="rs-3078" data-transition="slideremovehorizontal" data-slotamount="default" data-hideafterloop="0" data-hideslideonmobile="off" data-easein="default" data-easeout="default" data-masterspeed="default" data-thumb="assets/img-temp/1920x1080/img4.jpg" data-rotate="0" data-saveperformance="off" data-title="Slide" data-param1="" data-param2="" data-param3="" data-param4="" data-param5="" data-param6="" data-param7="" data-param8="" data-param9="" data-param10="" data-description="">
                <!-- MAIN IMAGE -->
                <img src="assets/img/bg/secondary.png" alt="Image description" data-lazyload="assets/img-temp/1920x1080/img4.jpg" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="5" class="rev-slidebg">
                <!-- LAYERS -->

                
              </li>
            </ul>
            <div class="tp-bannertimer tp-bottom" style="visibility: hidden !important;"></div>
          </div>
        </div>
      </div>
      <!-- End Revolution Slider -->

      <!-- Features -->
      <div class="g-brd-bottom g-brd-gray-light-v4">
        <div class="container g-py-30">
          <div class="row justify-content-center">
            <div class="col-md-4 mx-auto g-py-15">
              <div class="media g-px-50--lg">
                <i class="d-flex g-color-black g-font-size-30 g-pos-rel g-top-3 mr-4 icon-real-estate-048 u-line-icon-pro"></i>
                <div class="media-body">
                  <span class="d-block g-font-weight-500 g-font-size-default text-uppercase">무료 배송</span>
                  <span class="d-block g-color-gray-dark-v4">2-3일 이내</span>
                </div>
              </div>
            </div>

            <div class="col-md-4 mx-auto g-brd-x--md g-brd-gray-light-v3 g-py-15">
              <div class="media g-px-50--lg">
                <i class="d-flex g-color-black g-font-size-30 g-pos-rel g-top-3 mr-4 icon-real-estate-040 u-line-icon-pro"></i>
                <div class="media-body">
                  <span class="d-block g-font-weight-500 g-font-size-default text-uppercase">반품 및 환불</span>
                  <span class="d-block g-color-gray-dark-v4">수령 후 7일 이내</span>
                </div>
              </div>
            </div>

            <div class="col-md-4 mx-auto g-py-15">
              <div class="media g-px-50--lg">
                <i class="d-flex g-color-black g-font-size-30 g-pos-rel g-top-3 mr-4 icon-hotel-restaurant-062 u-line-icon-pro"></i>
                <div class="media-body text-left">
                  <span class="d-block g-font-weight-500 g-font-size-default text-uppercase">24시 접수</span>
                  <span class="d-block g-color-gray-dark-v4">상시 주문 접수 대기</span>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- End Features -->
      
	 <!-- Namdo Insa -->
     <img class="img-fluid" src="assets/img/logo/insa.jpg" alt="namdo insa" style="display: block; margin-left: auto; margin-right: auto;">
 		<!-- End Namdo Insa -->
 		
      <!-- Subscribe -->
      <div class="text-center g-max-width-600 mx-auto g-pb-30">
        <div class="g-px-30 g-px-50--md">
          <div class="mb-3">
            <span class="d-inline-block g-width-3 g-height-10 g-bg-gray-light-v1 g-mb-4"></span><br>
            <span class="d-inline-block g-width-3 g-height-16 g-bg-gray-dark-v5"></span><br>
            <span class="d-inline-block g-color-gray-dark-v4 fa fa-arrow-down"></span>
          </div>

          <h2 class="h3 g-mb-30">Subscribe</h2>

          <form class="input-group u-shadow-v21 rounded g-mb-50">
            <input class="form-control g-brd-gray-light-v4 g-brd-right-none g-color-gray-dark-v4 g-placeholder-gray-dark-v3 g-px-25 g-py-17" type="email" placeholder="Enter your email">
            <span class="input-group-append u-shadow-v19 g-brd-gray-light-v4 g-bg-white">
              <button class="btn u-btn-primary g-font-size-12 text-uppercase g-py-12 g-px-25" type="submit">Submit</button>
            </span>
          </form>
        </div>
      </div>
      <!-- End Subscribe -->

      <!-- Social Icons -->
      <div class="container g-mb-30">
        <ul class="list-inline text-center mb-0">
          <li class="list-inline-item g-mx-2">
            <a class="u-icon-v1 u-icon-slide-up--hover g-color-gray-dark-v4 g-color-facebook--hover" href="#">
              <i class="g-font-size-18 g-line-height-1 u-icon__elem-regular fa fa-facebook"></i>
              <i class="g-font-size-18 g-line-height-0_8 u-icon__elem-hover fa fa-facebook"></i>
            </a>
          </li>
          <li class="list-inline-item g-mx-2">
            <a class="u-icon-v1 u-icon-slide-up--hover g-color-gray-dark-v4 g-color-twitter--hover" href="#">
              <i class="g-font-size-18 g-line-height-1 u-icon__elem-regular fa fa-twitter"></i>
              <i class="g-font-size-18 g-line-height-0_8 u-icon__elem-hover fa fa-twitter"></i>
            </a>
          </li>
          <li class="list-inline-item g-mx-2">
            <a class="u-icon-v1 u-icon-slide-up--hover g-color-gray-dark-v4 g-color-instagram--hover" href="#">
              <i class="g-font-size-18 g-line-height-1 u-icon__elem-regular fa fa-instagram"></i>
              <i class="g-font-size-18 g-line-height-0_8 u-icon__elem-hover fa fa-instagram"></i>
            </a>
          </li>
          <li class="list-inline-item g-mx-2">
            <a class="u-icon-v1 u-icon-slide-up--hover g-color-gray-dark-v4 g-color-google-plus--hover" href="#">
              <i class="g-font-size-18 g-line-height-1 u-icon__elem-regular fa fa-google-plus"></i>
              <i class="g-font-size-18 g-line-height-0_8 u-icon__elem-hover fa fa-google-plus"></i>
            </a>
          </li>
          <li class="list-inline-item g-mx-2">
            <a class="u-icon-v1 u-icon-slide-up--hover g-color-gray-dark-v4 g-color-linkedin--hover" href="#">
              <i class="g-font-size-18 g-line-height-1 u-icon__elem-regular fa fa-linkedin"></i>
              <i class="g-font-size-18 g-line-height-0_8 u-icon__elem-hover fa fa-linkedin"></i>
            </a>
          </li>
        </ul>
      </div>
      <!-- End Social Icons -->

      <!-- Footer -->
      <jsp:include page="common/footer-main.jsp"/>

      <a class="js-go-to u-go-to-v2" href="#"
         data-type="fixed"
         data-position='{
           "bottom": 15,
           "right": 15
         }'
         data-offset-top="400"
         data-compensation="#js-header"
         data-show-effect="zoomIn">
        <i class="hs-icon hs-icon-arrow-top"></i>
      </a>
    </main>

    <div class="u-outer-spaces-helper"></div>

    <!-- JS Global Compulsory -->
    <script src="../assets/vendor/jquery/jquery.min.js"></script>
    <script src="../assets/vendor/jquery-migrate/jquery-migrate.min.js"></script>
    <script src="../assets/vendor/popper.js/popper.min.js"></script>
    <script src="../assets/vendor/bootstrap/bootstrap.min.js"></script>

    <!-- JS Implementing Plugins -->
    <script src="../assets/vendor/jquery.countdown.min.js"></script>
    <script src="../assets/vendor/slick-carousel/slick/slick.js"></script>
    <script src="../assets/vendor/hs-megamenu/src/hs.megamenu.js"></script>
    <script src="../assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>

    <!-- JS Master Slider -->
    <!--  --><script src="../assets/vendor/master-slider/source/assets/js/masterslider.min.js"></script>

    <!-- JS Unify -->
    <script src="../assets/js/hs.core.js"></script>
    <script src="../assets/js/components/hs.header.js"></script>
    <script src="../assets/js/helpers/hs.hamburgers.js"></script>
    <script src="../assets/js/components/hs.dropdown.js"></script>
    <script src="../assets/js/components/hs.scrollbar.js"></script>
    <script src="../assets/js/components/hs.countdown.js"></script>
    <script src="../assets/js/components/hs.carousel.js"></script>
    <script src="../assets/js/components/hs.go-to.js"></script>

    <!-- JS Revolution Slider -->
    <script src="../assets/vendor/revolution-slider/revolution/js/jquery.themepunch.tools.min.js"></script>
    <script src="../assets/vendor/revolution-slider/revolution/js/jquery.themepunch.revolution.min.js"></script>

    <script src="../assets/vendor/revolution-slider/revolution/js/extensions/revolution.extension.actions.min.js"></script>
    <script src="../assets/vendor/revolution-slider/revolution/js/extensions/revolution.extension.carousel.min.js"></script>
    <script src="../assets/vendor/revolution-slider/revolution/js/extensions/revolution.extension.kenburn.min.js"></script>
    <script src="../assets/vendor/revolution-slider/revolution/js/extensions/revolution.extension.layeranimation.min.js"></script>
    <script src="../assets/vendor/revolution-slider/revolution/js/extensions/revolution.extension.migration.min.js"></script>
    <script src="../assets/vendor/revolution-slider/revolution/js/extensions/revolution.extension.navigation.min.js"></script>
    <script src="../assets/vendor/revolution-slider/revolution/js/extensions/revolution.extension.parallax.min.js"></script>
    <script src="../assets/vendor/revolution-slider/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
    <script src="../assets/vendor/revolution-slider/revolution/js/extensions/revolution.extension.video.min.js"></script>

    <!-- JS Customization -->
    <script src="../assets/js/custom.js"></script>

    <!-- JS Plugins Init. -->
    <script>
      $(document).on('ready', function () {
        // initialization of carousel
        $.HSCore.components.HSCarousel.init('[class*="js-carousel"]');

        $('#carouselCus1').slick('setOption', 'responsive', [{
          breakpoint: 1200,
          settings: {
            slidesToShow: 4
          }
        }, {
          breakpoint: 992,
          settings: {
            slidesToShow: 3
          }
        }, {
          breakpoint: 768,
          settings: {
            slidesToShow: 2
          }
        }], true);
      });

      // initialization of header
      $.HSCore.components.HSHeader.init($('#js-header'));
      $.HSCore.helpers.HSHamburgers.init('.hamburger');

      // initialization of HSMegaMenu component
      $('.js-mega-menu').HSMegaMenu({
        event: 'hover',
        pageContainer: $('.container'),
        breakpoint: 991
      });

      // initialization of HSDropdown component
      $.HSCore.components.HSDropdown.init($('[data-dropdown-target]'), {
        afterOpen: function () {
          $(this).find('input[type="search"]').focus();
        }
      });

      // initialization of go to
      $.HSCore.components.HSGoTo.init('.js-go-to');

      // initialization of countdowns
      var countdowns = $.HSCore.components.HSCountdown.init('.js-countdown', {
        yearsElSelector: '.js-cd-years',
        monthElSelector: '.js-cd-month',
        daysElSelector: '.js-cd-days',
        hoursElSelector: '.js-cd-hours',
        minutesElSelector: '.js-cd-minutes',
        secondsElSelector: '.js-cd-seconds'
      });

      $(window).on('load', function() {
        // initialization of HSScrollBar component
        $.HSCore.components.HSScrollBar.init($('.js-scrollbar'));
      });

      // Revolution Slider
      var tpj = jQuery;

      var revapi1086;
      tpj(document).ready(function () {
        if (tpj("#rev_slider_1086_1").revolution == undefined) {
          revslider_showDoubleJqueryError("#rev_slider_1086_1");
        } else {
          revapi1086 = tpj("#rev_slider_1086_1").show().revolution({
            sliderType: "standard",
            jsFileLocation: "revolution/js/",
            sliderLayout: "auto",
            dottedOverlay: "none",
            delay: 9000,
            navigation: {
              keyboardNavigation: "off",
              keyboard_direction: "horizontal",
              mouseScrollNavigation: "off",
              mouseScrollReverse: "default",
              onHoverStop: "on",
              touch: {
                touchenabled: "on",
                swipe_threshold: 75,
                swipe_min_touches: 50,
                swipe_direction: "horizontal",
                drag_block_vertical: false
              }
              ,
              arrows: {
                style: "gyges",
                enable: true,
                hide_onmobile: false,
                hide_onleave: false,
                tmp: '',
                left: {
                  h_align: "right",
                  v_align: "bottom",
                  h_offset: 40,
                  v_offset: 0
                },
                right: {
                  h_align: "right",
                  v_align: "bottom",
                  h_offset: 0,
                  v_offset: 0
                }
              }
            },
            responsiveLevels: [1240, 1024, 778, 480],
            visibilityLevels: [1240, 1024, 778, 480],
            gridwidth: [1200, 1024, 778, 480],
            gridheight: [600, 600, 600, 600],
            lazyType: "single",
            parallax: {
              type: "scroll",
              origo: "slidercenter",
              speed: 400,
              levels: [5, 10, 15, 20, 25, 30, 35, 40, 45, 46, 47, 48, 49, 50, 51, 55],
              type: "scroll",
            },
            shadow: 0,
            spinner: "off",
            stopLoop: "off",
            stopAfterLoops: -1,
            stopAtSlide: -1,
            shuffle: "off",
            autoHeight: "off",
            disableProgressBar: "on",
            hideThumbsOnMobile: "off",
            hideSliderAtLimit: 0,
            hideCaptionAtLimit: 0,
            hideAllCaptionAtLilmit: 0,
            debugMode: false,
            fallbacks: {
              simplifyAll: "off",
              nextSlideOnWindowFocus: "off",
              disableFocusListener: false,
            }
          });
        }
      });
    </script>
</body>
</html>