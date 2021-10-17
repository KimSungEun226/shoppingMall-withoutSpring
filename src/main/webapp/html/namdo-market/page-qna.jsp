<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    

<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Title -->
    <title>E-commerce Help Page | Unify - Responsive Website Template</title>

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
    <link rel="stylesheet" href="../assets/vendor/icon-line/css/simple-line-icons.css">

    <!-- CSS Implementing Plugins -->
    <link rel="stylesheet" href="../assets/vendor/icon-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../assets/vendor/icon-line-pro/style.css">
    <link rel="stylesheet" href="../assets/vendor/icon-hs/style.css">
    <link rel="stylesheet" href="../assets/vendor/animate.css">
    <link rel="stylesheet" href="../assets/vendor/hamburgers/hamburgers.min.css">
    <link rel="stylesheet" href="../assets/vendor/hs-megamenu/src/hs.megamenu.css">
    <link rel="stylesheet" href="../assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.min.css">

    <!-- CSS Unify Theme -->
    <link rel="stylesheet" href="assets/css/styles.e-commerce.css">

    <!-- CSS Customization -->
    <link rel="stylesheet" href="../assets/css/custom.css">
  </head>

  <body>
    <main>
      <!-- Header -->
      <c:if test="${sessionScope.customerDTO==null && sessionScope.sellerDTO==null && sessionScope.adminDTO==null}">
        <jsp:include page="common/header.jsp"/>
      </c:if>

      <c:if test="${sessionScope.customerDTO!=null}">
        <jsp:include page="common/customer-header.jsp"/>
      </c:if>

      <c:if test="${sessionScope.sellerDTO!=null}">
        <jsp:include page="common/seller-header.jsp"/>
      </c:if>

      <c:if test="${sessionScope.adminDTO!=null}">
        <jsp:include page="common/admin-header-main.jsp"/>
      </c:if>

      <!-- Breadcrumbs -->
      <section class="g-brd-bottom g-brd-gray-light-v4 g-py-30">
        <div class="container">
          <ul class="u-list-inline">
            <li class="list-inline-item g-mr-5">
              <a class="u-link-v5 g-color-text" href="home-page.jsp">요거 묵어봤는감?</a>
              <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
            </li>
            <li class="list-inline-item g-mr-5">
              <a class="u-link-v5 g-color-text" href="page-serviec-center.jsp">고객센터</a>
              <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
            </li>
            <li class="list-inline-item g-color-primary">
              <span>상품 Q&amp;A</span>
            </li>
          </ul>
        </div>
      </section>
      <!-- End Breadcrumbs -->

      <!-- Help -->
      <div class="container g-pt-70 g-pb-70">
        <div class="row g-mb-20">
          
            <h2 class="mb-5">상품 Q&amp;A</h2>


          <div class="col-md-8 g-mb-30">
            <!-- Tab panes -->
            <div id="nav-5-3-primary-ver" class="tab-content g-pt-40 g-pt-0--md">
              
                

				<br><br><br>
                <!-- Accordion -->
                <div id="accordion-12-1" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                  <div class="g-overflow-x-scroll g-overflow-x-visible--lg">
                    
                    <table class="text-left w-100">
                      <thead class="h6 g-brd-bottom g-brd-gray-light-v3 g-color-black text-uppercase">
                        <tr>
                        <th>
                          <ul class="list-unstyled g-color-gray-dark-v4 g-font-size-12 g-line-height-1_6 mb-0">
                            <li><h4 class="h5 g-color-black">제목: <b>상품 Q&amp;A입니다.</b></h4></li>
                            <li>오지원 &nbsp;조회수 2</li>
                          </ul>
                          <div class="text-right">
                            <a class="text-uppercase g-color-primary--hover g-px-0 g-py-0" href="page-category.jsp">수정</a>&nbsp;&nbsp;<a class="text-uppercase g-color-primary--hover g-px-0 g-py-0" href="page-category.jsp">삭제</a> 
                          </div>
                          <br>
                        </th>
                        </tr>
                      </thead>

                      <tbody>
                        <!-- Item-->  
                        <tr class="g-brd-bottom g-brd-gray-light-v3">
                          <td class="text-left g-py-50">상품 내용입니다...</td> 
                        </tr>
                        
                        <!-- End Item-->

                      </tbody>
                    </table>
                  </div>
                  <!-- End Products Block -->
                </div>
                <!-- End Accordion -->
                <br><br><br>
                <div class="row">
		          <div class="col-md-4 g-mb-30">
		            <!-- Media -->
		            <div class="media">
		              <div class="d-flex mr-2">
		                <span class="u-icon-v3 g-width-20 g-height-20 g-color-white g-bg-primary g-font-size-12 rounded-circle">
		                  <i class="fa fa-question"></i>
		                </span>
		              </div>
		              <div class="media-body">
		                <a class="u-link-v5 g-color-main g-color-primary--hover g-font-weight-600" href="#">답변하기</a>
		               
		              </div>
		            </div>
		            <!-- End Media -->
		          </div>
		
		          <div class="col-md-8 g-mb-30">
		            <!-- Contact Form -->
		            <form>
		              <div class="row">
		                <div class="col-md-6 form-group g-mb-20">
		                  <input class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 g-brd-primary--hover rounded g-py-13 g-px-15" type="text" placeholder="이름">
		                </div>
		
		                <div class="col-md-6 form-group g-mb-20">
		                  <input class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 g-brd-primary--hover rounded g-py-13 g-px-15" type="password" placeholder="비밀번호">
		                </div>
		
		                <div class="col-md-12 form-group g-mb-40">
		                  <textarea class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 g-brd-primary--hover g-resize-none rounded g-py-13 g-px-15" rows="7" placeholder="내용"></textarea>
		                </div>
		                </div>
		
		                <div class="text-center">
		                  <button class="btn u-btn-primary g-font-size-12 text-uppercase g-py-12 g-px-25" type="submit"><b>등록하기</b></button>
		                </div>
		              </form>
		              <!-- End Contact Form -->
		            </div>
		          </div>
              
            </div>
            <!-- End Tab panes -->
          </div>
          
      

        
      </div>
      <!-- End Help -->
      </div>

      <!-- Call to Action -->
      <div class="g-bg-primary">
        <div class="container g-py-20">
          <div class="row justify-content-center">
            <div class="col-md-4 mx-auto g-py-20">
              <!-- Media -->
              <div class="media g-px-50--lg">
                <i class="d-flex g-color-white g-font-size-40 g-pos-rel g-top-3 mr-4 icon-real-estate-048 u-line-icon-pro"></i>
                <div class="media-body">
                  <span class="d-block g-color-white g-font-weight-500 g-font-size-17 text-uppercase">무료 배송</span>
                  <span class="d-block g-color-white-opacity-0_8">2-3일 이내</span>
                </div>
              </div>
              <!-- End Media -->
            </div>

            <div class="col-md-4 mx-auto g-brd-x--md g-brd-white-opacity-0_3 g-py-20">
              <!-- Media -->
              <div class="media g-px-50--lg">
                <i class="d-flex g-color-white g-font-size-40 g-pos-rel g-top-3 mr-4 icon-real-estate-040 u-line-icon-pro"></i>
                <div class="media-body">
                  <span class="d-block g-color-white g-font-weight-500 g-font-size-17 text-uppercase">반품 및 환불</span>
                  <span class="d-block g-color-white-opacity-0_8">수령 후 7일 이내</span>
                </div>
              </div>
              <!-- End Media -->
            </div>

            <div class="col-md-4 mx-auto g-py-20">
              <!-- Media -->
              <div class="media g-px-50--lg">
                <i class="d-flex g-color-white g-font-size-40 g-pos-rel g-top-3 mr-4 icon-hotel-restaurant-062 u-line-icon-pro"></i>
                <div class="media-body text-left">
                  <span class="d-block g-color-white g-font-weight-500 g-font-size-17 text-uppercase">24시 접수</span>
                  <span class="d-block g-color-white-opacity-0_8">상시 주문 접수 대기</span>
                </div>
              </div>
              <!-- End Media -->
            </div>
          </div>
        </div>
      </div>
      <!-- End Call to Action -->

      <!-- Footer -->
      <jsp:include page="common/footer.jsp"/>

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
    <script src="../assets/vendor/hs-megamenu/src/hs.megamenu.js"></script>
    <script src="../assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>

    <!-- JS Unify -->
    <script src="../assets/js/hs.core.js"></script>
    <script src="../assets/js/components/hs.header.js"></script>
    <script src="../assets/js/helpers/hs.hamburgers.js"></script>
    <script src="../assets/js/components/hs.dropdown.js"></script>
    <script src="../assets/js/components/hs.scrollbar.js"></script>
    <script src="../assets/js/components/hs.go-to.js"></script>
    <script src="../assets/js/components/hs.tabs.js"></script>

    <!-- JS Customization -->
    <script src="../assets/js/custom.js"></script>

    <!-- JS Plugins Init. -->
    <script>
      $(document).on('ready', function () {
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

        // initialization of HSScrollBar component
        $.HSCore.components.HSScrollBar.init($('.js-scrollbar'));

        // initialization of go to
        $.HSCore.components.HSGoTo.init('.js-go-to');

        // Tabs
        $.HSCore.components.HSTabs.init('[role="tablist"]');
      });

      $(window).on('resize', function () {
        setTimeout(function () {
          $.HSCore.components.HSTabs.init('[role="tablist"]');
        }, 200);
      });
    </script>
  </body>
</html>
