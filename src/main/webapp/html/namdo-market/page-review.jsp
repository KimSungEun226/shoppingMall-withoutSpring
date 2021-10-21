<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Title -->
    <title>E-commerce Single Product Page 4 | Unify - Responsive Website Template</title>

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

    <!-- CSS Implementing Plugins -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/icon-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/icon-line-pro/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/icon-hs/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/animate.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/hamburgers/hamburgers.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/hs-megamenu/src/hs.megamenu.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/slick-carousel/slick/slick.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.min.css">

    <!-- CSS Unify Theme -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/namdo-market/assets/css/styles.e-commerce.css">

    <!-- CSS Customization -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/css/custom.css">
    
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>

</head>
<body>

<c:choose>
	<c:when test="${empty requestScope.reviewList}">
	  <div id="accordion-12-1" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                 <!-- Card -->
                 <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                   <div id="accordion-12-1-heading-01" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                       아직 등록된 리뷰가 없습니다.
                   </div>
                 </div>
                 <!-- End Card -->
               </div>
	</c:when>
	<c:otherwise>
	<c:forEach items="${requestScope.reviewList}" var="reviewDto">
	<!-- Media -->
                 <div class="media g-mb-30">
                 <img class="d-flex g-width-60 g-height-60 rounded-circle g-mt-3 g-mr-20" src="${pageContext.request.contextPath}/html/namdo-market/assets/img-temp/480x700/main_480_700.png" alt="Image Description">
                   <div class="media-body">
                     <div class="d-flex align-items-start g-mb-15 g-mb-10--sm">
                       <div class="d-block">
                         <h5 class="h6">${reviewDto.customerName}</h5>

                         <!-- Rating -->
                         <ul class="js-rating u-rating-v1 g-font-size-13 g-color-gray-light-v3 mb-0" data-hover-classes="g-color-primary">
                           <li class="g-color-primary g-line-height-1_4">
                             <i class="fa fa-star"></i>
                           </li>
                           <li class="g-color-primary g-line-height-1_4">
                             <i class="fa fa-star"></i>
                           </li>
                           <li class="g-color-primary g-line-height-1_4">
                             <i class="fa fa-star"></i>
                           </li>
                           <li class="g-color-primary g-line-height-1_4">
                             <i class="fa fa-star"></i>
                           </li>
                           <li class="g-color-primary g-line-height-1_4">
                             <i class="fa fa-star"></i>
                           </li>
                         </ul>
                         <!-- End Rating -->

                         <span class="d-block g-color-gray-dark-v5 g-font-size-11">${reviewDto.reviewDate}</span>
                       </div>
                       <div class="ml-auto">
                         <a class="u-link-v5 g-color-black g-color-primary--hover g-font-size-12 text-uppercase" href="#">답변하기</a>
                       </div>
                     </div>

                     <p>${reviewDto.reviewContent}</p>

                     <ul class="list-inline my-0">
                       <li class="list-inline-item g-mr-20">
                         <a class="g-color-gray-dark-v5 g-text-underline--none--hover" href="#">
                           <i class="icon-finance-206 u-line-icon-pro g-pos-rel g-top-1 g-mr-3"></i> 1
                         </a>
                       </li>
                     </ul>
                    
				  
                  <br><br><br><br>
                  <h2 class="h4 mb-5">리뷰 등록하기</h2>

                  <!-- Comment Form -->
                  <form>
                    <div class="row">
                      <div class="col-md-6 form-group g-mb-30">
                        <input class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 g-brd-primary--focus rounded-3 g-py-13 g-px-15" type="text" placeholder="First name">
                      </div>

                      <div class="col-md-6 form-group g-mb-30">
                        <input class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 g-brd-primary--focus rounded-3 g-py-13 g-px-15" type="email" placeholder="Email">
                      </div>
                    </div>
                  </form>
                  <!-- End Comment Form -->

                  <div class="g-mb-30">
                    <textarea class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 g-brd-primary--focus g-resize-none rounded-3 g-py-13 g-px-15" rows="12" placeholder="Your message"></textarea>
                  </div>

                  <div class="row align-items-center">
                    <div class="col-5 col-sm-4 col-md-3">
                      <button class="btn u-btn-primary g-font-size-12 text-uppercase g-py-15 g-px-25" type="submit" role="button">Add Comment</button>
                    </div>

                    <!-- Rating -->
                    <div class="col-5 col-sm-4 col-md-3">
                      <h3 class="h6 mb-1">Rate:</h3>

                      <ul class="js-rating u-rating-v1 g-font-size-20 g-color-gray-light-v3 mb-0" data-hover-classes="g-color-primary">
                        <li class="g-color-primary g-line-height-1_4 click">
                          <i class="fa fa-star"></i>
                        </li>
                        <li class="g-color-primary g-line-height-1_4 click">
                          <i class="fa fa-star"></i>
                        </li>
                        <li class="g-color-primary g-line-height-1_4 click">
                          <i class="fa fa-star"></i>
                        </li>
                        <li class="g-color-primary g-line-height-1_4 click">
                          <i class="fa fa-star"></i>
                        </li>
                        <li class="g-line-height-1_4">
                          <i class="fa fa-star"></i>
                        </li>
                      </ul>
                      <!-- End Rating -->
                    </div>
                  </div>
                   </div>
                 </div>
                 <!-- End Media -->
	</c:forEach>
	</c:otherwise>
	</c:choose>
</body>
</html>