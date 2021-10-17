<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ko">
  <head>
    <!-- Title -->
    <title>E-commerce Login &amp; Security Page | Unify - Responsive Website Template</title>


    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
    
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
    
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
    
    
 
    
  </head>

  <body>
    <main>
      <!-- Header -->
      <c:if test="${sessionScope.customerDTO==null && sessionScope.sellerDTO==null}">
        <jsp:include page="common/header.jsp"/>
      </c:if>

      <c:if test="${sessionScope.customerDTO!=null}">
        <jsp:include page="common/customer-header.jsp"/>
      </c:if>

      <c:if test="${sessionScope.sellerDTO!=null}">
        <jsp:include page="common/seller-header.jsp"/>
      </c:if>
      <!-- End Header -->

      <!-- Breadcrumbs -->
      <section class="g-brd-bottom g-brd-gray-light-v4 g-py-30">
        <div class="container">
          <div class="d-sm-flex text-center">
            <div class="align-self-center">
              <h1 class="h3 mb-0">내 정보</h1>
            </div>

            <div class="align-self-center ml-auto">
              <ul class="u-list-inline">
                <li class="list-inline-item g-mr-5">
                  <a class="u-link-v5 g-color-text" href="#">Home</a>
                  <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
                </li>
                <li class="list-inline-item g-mr-5">
                  <a class="u-link-v5 g-color-text" href="#">Pages</a>
                  <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
                </li>
                <li class="list-inline-item g-color-primary">
                  <span>내 정보</span>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </section>
      <!-- End Breadcrumbs -->

      <div class="container g-pt-70 g-pb-30">
        <div class="row justify-content-center">
          <!-- Profile Settings -->
          
          <!-- End Profile Settings -->

          <!-- Login & Security -->

          <div class="col-lg-9 g-mb-50">
            <!-- Info -->
            <div class="g-brd-around g-brd-gray-light-v4 rounded g-pa-30 g-mb-30">
              <div class="row">
                <div class="col-8">
                  <span class="d-block g-color-text g-font-size-13 mb-1">ID:</span>
                  <span name="id" class="d-block">${sessionScope.customerDTO.customerId}</span>
                </div>

                
              </div>

              <hr class="g-brd-gray-light-v4 g-my-20">

              <div class="row">
                <div class="col-8">
                  <span class="d-block g-color-text g-font-size-13 mb-1">이름:</span>
                  <span class="d-block">${sessionScope.customerDTO.customerName}</span>
                </div>

                
              </div>

              <hr class="g-brd-gray-light-v4 g-my-20">

              <div class="row">
                <div class="col-8">
                  <span class="d-block g-color-text g-font-size-13 mb-1">Email:</span>
                  <span class="d-block">${sessionScope.customerDTO.customerEmail}</span>
                </div>

                
              </div>

              <hr class="g-brd-gray-light-v4 g-my-20">

              <div class="row">
                <div class="col-8">
                  <span class="d-block g-color-text g-font-size-13 mb-1">휴대전화:</span>
                  <span class="d-block">${sessionScope.customerDTO.customerContact}</span>
                </div>

              
              </div>

              <hr class="g-brd-gray-light-v4 g-my-20">
              
              <form>
              <div class="row">
                <div class="col-8">
                  <span class="d-block g-color-text g-font-size-13 mb-1">주소</span>
                  <span class="d-block">${sessionScope.customerDTO.customerAddr}</span>
                </div>

                <div class="col-4 text-right">
                  <a class="btn g-brd-around g-brd-gray-light-v3 g-color-gray-dark-v3 g-bg-gray-light-v5 g-bg-gray-light-v4--hover g-font-size-13 rounded g-px-18 g-py-7" href="#">Edit</a>
                </div>
              </div>
              </form>

              <hr class="g-brd-gray-light-v4 g-my-20">
              
              <form method="post" action="${pageContext.request.contextPath}/front" >
                <input type="hidden" name="key" value = "customer" /> <!-- Controller를 찾는 정보 -->
			    <input type="hidden" name="methodName" value = "checkPwd" />  <!-- 메소드이름 -->
			    <input type="hidden" name="id" value = "${sessionScope.customerDTO.customerId}" />  <!-- 메소드이름 -->
			    
              <div class="row">
                <div class="col-8">
                  <span class="d-block g-color-text g-font-size-13 mb-1">Password:</span>
                  <input name="pwd" class="d-block" type="password"></span>
                </div>

                <div class="col-4 text-right">
                  <button type="submit" class="btn g-brd-around g-brd-gray-light-v3 g-color-gray-dark-v3 g-bg-gray-light-v5 g-bg-gray-light-v4--hover g-font-size-13 rounded g-px-18 g-py-7" >Edit</a>
                </div>
              
              </div>
              </form>
              
            </div>
            <!-- End Info -->

          </div>
          <!-- End Login & Security -->
        </div>
      </div>

	  <!-- Footer  -->
      <jsp:include page="common/footer.jsp"/>
    
    
	  <!-- 맨 위로 가기 -->
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
  </body>
</html>
