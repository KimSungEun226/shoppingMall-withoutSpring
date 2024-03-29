<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Title -->
    <title>E-commerce Category No Sidebar Page 4 | Unify - Responsive Website Template</title>

    <!-- Required Meta Tags Always Come First -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <!-- Favicon -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/html/favicon.ico">

    <!-- Google Fonts -->
    <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700,900">

    <!-- CSS Global Compulsory -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/icon-line/css/simple-line-icons.css">

    <!-- CSS Implementing Plugins -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/icon-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/icon-line-pro/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/icon-hs/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/dzsparallaxer/dzsparallaxer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/dzsparallaxer/dzsscroller/scroller.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/dzsparallaxer/advancedscroller/plugin.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/animate.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/hamburgers/hamburgers.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/hs-megamenu/src/hs.megamenu.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.min.css">

    <!-- CSS Unify Theme -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/namdo-market/assets/css/styles.e-commerce.css">

    <!-- CSS Customization -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/css/custom.css">
    
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/namdo-market.js"></script>
    
  </head>

  <body>
    <main>
      <!-- Header -->
      <c:if test="${sessionScope.customerDTO==null && sessionScope.sellerDTO==null && sessionScope.adminDTO==null}">
        <jsp:include page="../../common/header-main.jsp"/>
      </c:if>

      <c:if test="${sessionScope.customerDTO!=null}">
        <jsp:include page="../../common/customer-header-main.jsp"/>
      </c:if>

      <c:if test="${sessionScope.sellerDTO!=null}">
        <jsp:include page="../../common/seller-header-main.jsp"/>
      </c:if>
      
      <c:if test="${sessionScope.adminDTO!=null}">
        <jsp:include page="../../common/admin-header-main.jsp"/>
      </c:if>

      <!-- Breadcrumbs -->
      <section class="g-brd-bottom g-brd-gray-light-v4 g-py-30">
        <div class="container">
          <ul class="u-list-inline">
            <li class="list-inline-item g-mr-5">
              <a class="u-link-v5 g-color-text" href="${pageContext.request.contextPath}/html/namdo-market/home-page.jsp">요거 묵어봤는감?</a>
              <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
            </li>
            <li class="list-inline-item g-mr-5">
              <a class="u-link-v5 g-color-text" href="#">지역별 특산품</a>
              <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
            </li>
            <li class="list-inline-item g-color-primary">
              <span>신안군</span>
            </li>
          </ul>
        </div>
      </section>
      <!-- End Breadcrumbs -->

      <!-- Filters -->
      <div class="container">
        <!-- Filters -->
        <div class="row align-items-center g-pt-40 g-pb-10 g-brd-y g-brd-gray-light-v4 ">
          <!-- Category -->
          <div class="col-md-12 col-lg-10 g-mb-30">
            <h3 class="h6 mb-3">종류 선택:</h3>

            <div>
              
              <label class="form-check-inline u-check u-link-v5 g-color-gray-dark-v4 g-color-primary--hover g-pl-25 mb-0 mr-2">
                <input class="g-hidden-xs-up g-pos-abs g-top-0 g-left-0" type="radio" name="cat-check" onclick="regionSelect(6)">
                <span class="d-block u-check-icon-checkbox-v4 g-absolute-centered--y g-left-0">
                  <i class="fa" data-check-icon="&#xf00c"></i>
                </span>
                전체
              </label>
              <label class="form-check-inline u-check u-link-v5 g-color-gray-dark-v4 g-color-primary--hover g-pl-25 mb-0 mx-2">
                <input class="g-hidden-xs-up g-pos-abs g-top-0 g-left-0" type="radio" name="cat-check" onclick="categoryOfRegionSelect(6,1)">
                <span class="d-block u-check-icon-checkbox-v4 g-absolute-centered--y g-left-0">
                  <i class="fa" data-check-icon="&#xf00c"></i>
                </span>
                생선
              </label>
              <label class="form-check-inline u-check u-link-v5 g-color-gray-dark-v4 g-color-primary--hover g-pl-25 mb-0 mx-2">
                <input class="g-hidden-xs-up g-pos-abs g-top-0 g-left-0" type="radio" name="cat-check" onclick="categoryOfRegionSelect(6,4)" checked>
                <span class="d-block u-check-icon-checkbox-v4 g-absolute-centered--y g-left-0">
                  <i class="fa" data-check-icon="&#xf00c"></i>
                </span>
                해산물/어패류
              </label>
              <label class="form-check-inline u-check u-link-v5 g-color-gray-dark-v4 g-color-primary--hover g-pl-25 mb-0 mx-2">
                <input class="g-hidden-xs-up g-pos-abs g-top-0 g-left-0" type="radio" name="cat-check" onclick="categoryOfRegionSelect(6,5)">
                <span class="d-block u-check-icon-checkbox-v4 g-absolute-centered--y g-left-0">
                  <i class="fa" data-check-icon="&#xf00c"></i>
                </span>
                젓갈
              </label>
              <label class="form-check-inline u-check u-link-v5 g-color-gray-dark-v4 g-color-primary--hover g-pl-25 mb-0 mx-2">
                <input class="g-hidden-xs-up g-pos-abs g-top-0 g-left-0" type="radio" name="cat-check" onclick="categoryOfRegionSelect(6,6)">
                <span class="d-block u-check-icon-checkbox-v4 g-absolute-centered--y g-left-0">
                  <i class="fa" data-check-icon="&#xf00c"></i>
                </span>
                기타
              </label>
            </div>
    	
          </div>
          <!-- End Category -->
			

            <!-- Sort By -->
            <div class="col-sm-2 col-md-2 g-mb-30">
              <h3 class="h6 mb-3">정렬:</h3>

              <!-- Secondary Button -->
              <div class="d-inline-block btn-group">
                <button type="button" class="btn btn-secondary dropdown-toggle h6 align-middle g-brd-none g-color-text g-color-primary--hover g-bg-transparent g-pa-0 g-ma-0" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  추천순
                </button>
                <div class="dropdown-menu rounded-0">
                  <a class="dropdown-item g-color-gray-dark-v4 g-font-weight-300" href="#">판매량순</a>
                  <a class="dropdown-item g-color-gray-dark-v4 g-font-weight-300" href="#">신상품순</a>
                  <a class="dropdown-item g-color-gray-dark-v4 g-font-weight-300" href="#">낮은가격순</a>
                  <a class="dropdown-item g-color-gray-dark-v4 g-font-weight-300" href="#">높은가격순</a>
                </div>
              </div>
              <!-- End Secondary Button -->
            </div>
            <!-- End Sort By -->
   
        </div>
        <!-- End Filters -->
      </div>
      <!-- End Filters -->

      <!-- Products -->
      <div class="container">
        <!-- Banner -->
        <div class="g-bg-size-cover g-bg-pos-center g-py-40 g-mt-50" style="background-image: url(${pageContext.request.contextPath}/html/namdo-market/assets/img-temp/900x450/sub1_900_450.png);">
          <div class="g-pos-rel g-z-index-1 g-pa-50">
            <span class="d-block g-color-primary g-font-weight-700 g-font-size-40 mb-0">-40%</span>
            <h2 class="g-color-white g-font-size-50 mb-3">가을 수산물 대축제</h2>
            <a class="btn u-btn-white g-brd-primary--hover g-color-primary g-color-white--hover g-bg-primary--hover g-font-size-12 text-uppercase g-py-12 g-px-25" href="home-page.jsp">Shop Now</a>
          </div>
        </div>
        <!-- End Banner -->
		<!-- Products -->
        <div class="row g-pt-30 g-mb-50">
		<c:choose>
			<c:when test="${empty requestScope.itemList}">
			  <div id="accordion-12-1" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                   <!-- Card -->
                   <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                     <div id="accordion-12-1-heading-01" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                         등록된 상품이 없습니다.
                     </div>
                   </div>
                   <!-- End Card -->
                 </div>
			</c:when>
			
			<c:otherwise>
			<c:forEach items="${requestScope.itemList}" var="itemDto">
			  <div class="col-6 col-lg-3 g-mb-30">
	            <!-- Product -->
	            <figure class="g-pos-rel g-mb-20">
	              <a href="${pageContext.request.contextPath}/front?key=item&methodName=selectDetail&itemNo=${itemDto.itemNo}">
	              	<img class="img-fluid  g-width-250 g-height-300" src="${pageContext.request.contextPath}/save/${itemDto.mainImg}" alt="Image Description">
	              </a>
	            </figure>
	
	            <div class="media">
	              <!-- Product Info -->
	              <div class="d-flex flex-column">
	                <h4 class="h6 g-color-black mb-1">
	                  <a class="u-link-v5 g-color-black g-color-primary--hover" href="#">
	                    <b>${itemDto.itemName}</b>
	                  </a>
	                </h4>
	                <a id="${itemDto.categoryNo}" class="d-inline-block g-color-gray-dark-v5 g-font-size-13" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=${itemDto.categoryNo}">${itemDto.categoryNo}</a>
	                <span class="d-block g-color-black g-font-size-17">
	                <fmt:formatNumber value="${itemDto.itemPrice}"/>원
	                </span>
	              </div>
	              <!-- End Product Info -->
	
	              <!-- Products Icons -->
	              <ul class="list-inline media-body text-right">
	                <li class="list-inline-item align-middle mx-0">
	                  <a class="u-icon-v1 u-icon-size--sm g-color-gray-dark-v5 g-color-primary--hover g-font-size-15 rounded-circle" href="#"
	                     data-toggle="tooltip"
	                     data-placement="top"
	                     title="Add to Cart">
	                    <i class="icon-finance-100 u-line-icon-pro"></i>
	                  </a>
	                </li>
	                <li class="list-inline-item align-middle mx-0">
	                  <a class="u-icon-v1 u-icon-size--sm g-color-gray-dark-v5 g-color-primary--hover g-font-size-15 rounded-circle" href="#"
	                     data-toggle="tooltip"
	                     data-placement="top"
	                     title="Add to Wishlist">
	                    <i class="icon-medical-022 u-line-icon-pro"></i>
	                  </a>
	                </li>
	              </ul>
	              <!-- End Products Icons -->
	            </div>
	            <!-- End Product -->
	          </div>
               
			</c:forEach>

			</c:otherwise>
			</c:choose>
			
			</div>
		</div>
      <!-- Footer -->
      <jsp:include page="../../common/footer.jsp"/>
      
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
    <script src="${pageContext.request.contextPath}/html/assets/vendor/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/jquery-migrate/jquery-migrate.min.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/popper.js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/bootstrap/bootstrap.min.js"></script>

    <!-- JS Implementing Plugins -->
    <script src="${pageContext.request.contextPath}/html/assets/vendor/jquery-ui/ui/widget.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/jquery-ui/ui/widgets/menu.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/jquery-ui/ui/widgets/mouse.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/jquery-ui/ui/widgets/slider.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/dzsparallaxer/dzsparallaxer.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/dzsparallaxer/dzsscroller/scroller.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/dzsparallaxer/advancedscroller/plugin.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/hs-megamenu/src/hs.megamenu.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>

    <!-- JS Unify -->
    <script src="${pageContext.request.contextPath}/html/assets/js/hs.core.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.header.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/helpers/hs.hamburgers.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.dropdown.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.scrollbar.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/helpers/hs.rating.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.slider.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.go-to.js"></script>

    <!-- JS Customization -->
    <script src="${pageContext.request.contextPath}/html/assets/js/custom.js"></script>

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

        // initialization of rating
        $.HSCore.helpers.HSRating.init();

        // initialization of range slider
        $.HSCore.components.HSSlider.init('#rangeSlider1');
      });
    </script>

  </body>
</html>
