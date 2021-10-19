<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Title -->
    <title>E-commerce Orders Page | Unify - Responsive Website Template</title>

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
          <div class="d-sm-flex text-center">
            <div class="align-self-center">
              <h1 class="h3 mb-0"><b>주문 내역</b></h1>
            </div>

            <div class="align-self-center ml-auto">
              <ul class="u-list-inline">
                <li class="list-inline-item g-mr-5">
                  <a class="u-link-v5 g-color-text" href="#">요거 묵어봤는감?</a>
                  <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
                </li>
                <li class="list-inline-item g-color-primary">
                  <span>주문 내역</span>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </section>
      <!-- End Breadcrumbs -->

      <div class="container g-pt-70 g-pb-30">
        <div class="row">
          <!-- Profile Settings -->
          <div class="col-lg-3 g-mb-50">
            <aside class="g-brd-around g-brd-gray-light-v4 rounded g-px-20 g-py-30">
              <!-- Profile Picture -->
              <div class="text-center g-pos-rel g-mb-30">

                <span id="name" class="d-block g-font-weight-500"></span>

              </div>
              <!-- End Profile Picture -->

              <hr class="g-brd-gray-light-v4 g-my-30">

              <!-- Profile Settings List -->
              <ul class="list-unstyled mb-0">
                <li class="g-pb-3">
                  <a class="d-block align-middle u-link-v5 g-color-text g-color-primary--hover g-bg-gray-light-v5--hover rounded g-pa-3" href="page-wallet-1.html">
                    <span class="u-icon-v1 g-color-gray-dark-v5 mr-2"><i class="icon-finance-059 u-line-icon-pro"></i></span>
                    내정보
                  </a>
                </li>
                <li class="g-py-3">
                  <a class="d-block align-middle active u-link-v5 g-color-text g-color-primary--hover g-bg-gray-light-v5--hover g-color-primary--parent-active g-bg-gray-light-v5--active rounded g-pa-3" href="page-orders-1.html">
                    <span class="u-icon-v1 g-color-gray-dark-v5 mr-2"><i class="icon-finance-114 u-line-icon-pro"></i></span>
                    장바구니
                  </a>
                </li>
                <li class="g-py-3">
                  <a class="d-block align-middle u-link-v5 g-color-text g-color-primary--hover g-bg-gray-light-v5--hover rounded g-pa-3" href="page-open-orders-1.html">
                    <span class="u-icon-v1 g-color-gray-dark-v5 mr-2"><i class="icon-finance-115 u-line-icon-pro"></i></span>
                    주문내역
                  </a>
                </li>
              </ul>
              <!-- End Profile Settings List -->
            </aside>
          </div>
          <!-- End Profile Settings -->

          <!-- Orders -->
          <div class="col-lg-9 g-mb-50">

            <!-- Links -->
            <ul class="list-inline g-brd-bottom--sm g-brd-gray-light-v3 mb-5">
              <li class="list-inline-item g-pb-10 g-pr-10 g-mb-20 g-mb-0--sm">
                <a class="g-brd-bottom g-brd-2 g-brd-primary g-color-main g-color-black g-font-weight-600 g-text-underline--none--hover g-px-10 g-pb-13" href="page-orders-1.html">주문 목록</a>
              </li>
            </ul>
            <!-- End Links -->

            <div class="mb-5">
              <h3 class="h6 d-inline-block">주문 중인 상품 : 2 개</h3>
            </div>

            <!-- Order Block -->
            <div class="g-brd-around g-brd-gray-light-v4 rounded g-mb-30">
              <header class="g-bg-gray-light-v5 g-pa-20">
                <div class="row">
                  <div class="col-sm-3 col-md-2 g-mb-20 g-mb-0--sm">
                    <h4 class="g-color-gray-dark-v4 g-font-weight-400 g-font-size-12 text-uppercase g-mb-2">주문 일자</h4>
                    <span class="g-color-black g-font-weight-300 g-font-size-13">July 31, 2017</span>
                  </div>

                  <div class="col-sm-3 col-md-2 g-mb-20 g-mb-0--sm">
                    <h4 class="g-color-gray-dark-v4 g-font-weight-400 g-font-size-12 text-uppercase g-mb-2">합계</h4>
                    <span class="g-color-black g-font-weight-300 g-font-size-13">$379.00</span>
                  </div>

                  <div class="col-sm-3 col-md-2 g-mb-20 g-mb-0--sm">
                    <h4 class="g-color-gray-dark-v4 g-font-weight-400 g-font-size-12 text-uppercase g-mb-2">구매자 이름</h4>
                    <span class="g-color-black g-font-weight-300 g-font-size-13">James Collins</span>
                  </div>

                  <div class="col-sm-3 col-md-4 ml-auto text-sm-right">
                    <h4 class="g-color-gray-dark-v4 g-font-weight-400 g-font-size-12 text-uppercase g-mb-2">Order # 278-841024961890</h4>
                  </div>
                </div>
              </header>

              <!-- Order Content -->
              <div class="g-pa-20">
                <div class="row">
                  <div class="col-md-8">
                    <div class="mb-4">
                      <h3 class="h5 mb-1">2021 / 10 / 19</h3>
                    </div>

                    <div class="row">
                      <div class="col-4 col-sm-3 g-mb-30">
                        <img class="img-fluid" src="assets/img-temp/150x150/img9.jpg" alt="Image Description">
                      </div>

                      <div class="col-8 col-sm-9 g-mb-30">
                        <h4 class="h6 g-font-weight-400"><a href="page-single-product.jsp">제품 이름</a></h4>
                        <span class="d-block g-color-gray-dark-v4 g-font-size-13 mb-2">판매자 정보: 신용권</span>
                        <span class="d-block g-color-lightred mb-2">21,000원</span>
                        <a class="btn g-brd-around g-brd-gray-light-v3 g-color-gray-dark-v3 g-bg-gray-light-v5 g-bg-gray-light-v4--hover g-font-size-12 rounded g-px-18 g-py-7" href="page-single-product.jsp">상품 보기</a>
                      </div>
                    </div>
                  </div>

                  <div class="col-md-4">
                    <a class="btn btn-block g-brd-around g-brd-gray-light-v3 g-color-gray-dark-v3 g-bg-gray-light-v5 g-bg-gray-light-v4--hover g-font-size-12 text-uppercase g-py-12 g-px-25" href="#">환불하기</a>
                  </div>
                </div>
              </div>
              <!-- End Order Content -->
            </div>
            <!-- End Order Block -->

            <!-- Order Block -->
            <div class="g-brd-around g-brd-gray-light-v4 rounded">
              <header class="g-bg-gray-light-v5 g-pa-20">
                <div class="row">
                  <div class="col-sm-3 col-md-2 g-mb-20 g-mb-0--sm">
                    <h4 class="g-color-gray-dark-v4 g-font-weight-400 g-font-size-12 text-uppercase g-mb-2">Order Placed</h4>
                    <span class="g-color-black g-font-weight-300 g-font-size-13">May 29, 2017</span>
                  </div>

                  <div class="col-sm-3 col-md-2 g-mb-20 g-mb-0--sm">
                    <h4 class="g-color-gray-dark-v4 g-font-weight-400 g-font-size-12 text-uppercase g-mb-2">Total</h4>
                    <span class="g-color-black g-font-weight-300 g-font-size-13">$132.00</span>
                  </div>

                  <div class="col-sm-3 col-md-2 g-mb-20 g-mb-0--sm">
                    <h4 class="g-color-gray-dark-v4 g-font-weight-400 g-font-size-12 text-uppercase g-mb-2">Ship to</h4>
                    <span class="g-color-black g-font-weight-300 g-font-size-13">James Collins</span>
                  </div>

                  <div class="col-sm-3 col-md-4 ml-auto text-sm-right">
                    <h4 class="g-color-gray-dark-v4 g-font-weight-400 g-font-size-12 text-uppercase g-mb-2">Order # 541-296184168196</h4>
                    <a class="g-font-weight-300 g-font-size-13" href="#">Invoice</a>
                  </div>
                </div>
              </header>

              <!-- Order Content -->
              <div class="g-pa-20">
                <div class="row">
                  <div class="col-md-8">
                    <div class="mb-4">
                      <h3 class="h5 mb-1">Delivered May 29, 2017</h3>
                      <p class="g-color-gray-dark-v4 g-font-size-13">Your package was delivered per the instructions.</p>
                    </div>

                    <div class="row">
                      <div class="col-4 col-sm-3 g-mb-30">
                        <img class="img-fluid" src="assets/img-temp/150x150/img3.jpg" alt="Image Description">
                      </div>

                      <div class="col-8 col-sm-9 g-mb-30">
                        <h4 class="h6 g-font-weight-400"><a href="#">To Boot New York Men's Dodd Oxford, Parmadoc Tan, 7 M US</a></h4>
                        <span class="d-block g-color-gray-dark-v4 g-font-size-13 mb-2">Sold by: Unify.com LLC</span>
                        <span class="d-block g-color-lightred mb-2">$125.00</span>
                        <a class="btn g-brd-around g-brd-gray-light-v3 g-color-gray-dark-v3 g-bg-gray-light-v5 g-bg-gray-light-v4--hover g-font-size-13 rounded g-px-18 g-py-7" href="#">Buy it Again</a>
                      </div>
                    </div>
                  </div>

                  <div class="col-md-4">
                    <a class="btn btn-block u-btn-primary g-font-size-12 text-uppercase g-py-12 g-px-25 mb-4" href="#">Track Package</a>
                    <a class="btn btn-block g-brd-around g-brd-gray-light-v3 g-color-gray-dark-v3 g-bg-gray-light-v5 g-bg-gray-light-v4--hover g-font-size-12 text-uppercase g-py-12 g-px-25" href="#">Return Item</a>
                    <a class="btn btn-block g-brd-around g-brd-gray-light-v3 g-color-gray-dark-v3 g-bg-gray-light-v5 g-bg-gray-light-v4--hover g-font-size-12 text-uppercase g-py-12 g-px-25" href="#">Leave Package Feedback</a>
                    <a class="btn btn-block g-brd-around g-brd-gray-light-v3 g-color-gray-dark-v3 g-bg-gray-light-v5 g-bg-gray-light-v4--hover g-font-size-12 text-uppercase g-py-12 g-px-25" href="#">Write a Product Review</a>
                    <a class="btn btn-block g-brd-around g-brd-gray-light-v3 g-color-gray-dark-v3 g-bg-gray-light-v5 g-bg-gray-light-v4--hover g-font-size-12 text-uppercase g-py-12 g-px-25" href="#">Archive Order</a>
                  </div>
                </div>
              </div>
              <!-- End Order Content -->
            </div>
            <!-- End Order Block -->

            <!-- Pagination -->
            <nav class="g-mt-100" aria-label="Page Navigation">
              <ul class="list-inline mb-0">
                <li class="list-inline-item hidden-down">
                  <a class="active u-pagination-v1__item g-width-30 g-height-30 g-brd-gray-light-v3 g-brd-primary--active g-color-white g-bg-primary--active g-font-size-12 rounded-circle g-pa-5" href="#">1</a>
                </li>
                <li class="list-inline-item hidden-down">
                  <a class="u-pagination-v1__item g-width-30 g-height-30 g-color-gray-dark-v5 g-color-primary--hover g-font-size-12 rounded-circle g-pa-5" href="#">2</a>
                </li>
                <li class="list-inline-item">
                  <a class="u-pagination-v1__item g-width-30 g-height-30 g-brd-gray-light-v3 g-brd-primary--hover g-color-gray-dark-v5 g-color-primary--hover g-font-size-12 rounded-circle g-pa-5 g-ml-15" href="#" aria-label="Next">
                    <span aria-hidden="true">
                      <i class="fa fa-angle-right"></i>
                    </span>
                    <span class="sr-only">Next</span>
                  </a>
                </li>
                <li class="list-inline-item float-right">
                  <span class="u-pagination-v1__item-info g-color-gray-dark-v4 g-font-size-12 g-pa-5">Page 1 of 2</span>
                </li>
              </ul>
            </nav>
            <!-- End Pagination -->
          </div>
          <!-- Orders -->
        </div>
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
      });
    </script>
    <script type="text/javascript">
        document.getElementById("name").innerHTML = "<b>${sessionScope.customerDTO.customerName} 님</b>"
    </script>
  </body>
</html>
