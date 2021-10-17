<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    


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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/animate.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/hamburgers/hamburgers.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/hs-megamenu/src/hs.megamenu.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.min.css">

    <!-- CSS Unify Theme -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/namdo-market/assets/css/styles.e-commerce.css">

    <!-- CSS Customization -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/css/custom.css">
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

      <!-- Breadcrumbs -->
      <section class="g-brd-bottom g-brd-gray-light-v4 g-py-30">
        <div class="container">
          <ul class="u-list-inline">
            <li class="list-inline-item g-mr-5">
              <a class="u-link-v5 g-color-text" href="${pageContext.request.contextPath}/html/namdo-market/home-page.jsp">요거 묵어봤는감?</a>
              <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
            </li>
            <li class="list-inline-item g-color-primary">
              <span>고객센터</span>
            </li>
          </ul>
        </div>
      </section>
      <!-- End Breadcrumbs -->

      <!-- Help -->
      <div class="container g-pt-100 g-pb-70">
        <div class="row g-mb-20">
          <div class="col-md-3 g-mb-30">
            <h2 class="mb-5">고객센터</h2>

            <!-- Nav tabs -->
            <ul class="nav flex-column u-nav-v5-3 u-nav-primary g-bg-gray-light-v5 rounded g-pa-20" role="tablist" data-target="nav-5-3-primary-ver" data-tabs-mobile-type="slide-up-down" data-btn-classes="btn btn-md btn-block rounded-0 u-btn-outline-primary">
              <li class="nav-item">
                <a class="nav-link active g-brd-bottom-none g-color-primary--hover" data-toggle="tab" href="#nav-5-3-primary-ver--1" role="tab">공지사항</a>
              </li>
              <li class="nav-item">
                <a class="nav-link g-brd-bottom-none g-color-primary--hover" data-toggle="tab" href="#nav-5-3-primary-ver--2" role="tab">상품 Q&amp;A</a>
              </li>
              <li class="nav-item">
                <a class="nav-link g-brd-bottom-none g-color-primary--hover" data-toggle="tab" href="#nav-5-3-primary-ver--3" role="tab">배송문의</a>
              </li>
              <li class="nav-item">
                <a class="nav-link g-brd-bottom-none g-color-primary--hover" data-toggle="tab" href="#nav-5-3-primary-ver--4" role="tab">사용후기</a>
              </li>
              <li class="nav-item">
                <a class="nav-link g-brd-bottom-none g-color-primary--hover" data-toggle="tab" href="#nav-5-3-primary-ver--5" role="tab">입점문의</a>
              </li>
              <li class="nav-item">
                <a class="nav-link g-brd-bottom-none g-color-primary--hover" data-toggle="tab" href="#nav-5-3-primary-ver--6" role="tab">이벤트</a>
              </li>
            </ul>
            <!-- End Nav tabs -->
          </div>

          <div class="col-md-8 g-mb-30">
            <!-- Search Form -->
            <form class="g-pos-rel g-mb-50">
              <span class="g-pos-abs g-top-1 g-left-0 g-z-index-3 g-px-13 g-py-10">
                <i class="g-color-gray-dark-v4 g-font-size-12 icon-education-045 u-line-icon-pro"></i>
              </span>
              <input class="form-control u-form-control g-brd-around g-brd-gray-light-v3 g-brd-primary--focus g-font-size-13 g-rounded-3 g-pl-35" type="search" placeholder="검색">
            </form>
            <!-- End Search Form -->

            <!-- Tab panes -->
            <div id="nav-5-3-primary-ver" class="tab-content g-pt-20 g-pt-0--md">
              <div class="tab-pane fade show active" id="nav-5-3-primary-ver--1" role="tabpanel">
                <h3 class="h5 g-color-gray-dark-v2 g-mb-30"><b>공지사항</b></h3>
                <br>
                
				<c:choose>
				<c:when test="${empty requestScope.list}">
				  <div id="accordion-12-1" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                    <!-- Card -->
                    <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                      <div id="accordion-12-1-heading-01" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                          등록된 공지사항이 없습니다.
                      </div>
                    </div>
                    <!-- End Card -->
                  </div>
				</c:when>
				
				<c:otherwise>
				<c:forEach items="${requestScope.list}" var="boardDto">
				  <!-- Accordion -->
                  <div id="accordion-12-1" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                    <!-- Card -->
                    <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                      <div id="accordion-12-1-heading-01" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                        <a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover" href="${path}/front?key=board&methodName=selectByBoardNo&boardNo=${boardDto.boardNo}">
                          <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">${boardDto.boardNo}.&nbsp;</span>
                          ${boardDto.boardName}
                        </a>
                      </div>
                    </div>
                    <!-- End Card -->

                  </div>
                  <!-- End Accordion -->
                
				</c:forEach>
				</c:otherwise>
				</c:choose>
				
                
                <div class="col-md-8 g-mb-30">
		            <!-- Contact Form -->
		            <form>
		                <div class="text-center">
		                  <button class="btn u-btn-primary g-font-size-12 text-uppercase g-py-12 g-px-25" type="button" onclick="location.href='${pageContext.request.contextPath}/html/namdo-market/page-notice-insert.jsp'"><b>글쓰기</b></button>
		                </div>
		              </form>
		              <!-- End Contact Form -->
		            </div>
              </div>

              <div class="tab-pane fade" id="nav-5-3-primary-ver--2" role="tabpanel">
                <h3 class="h5 g-color-gray-dark-v2 g-mb-30"><b>상품 Q&amp;A</b></h3>

				<br>
                <!-- Accordion -->
                <div id="accordion-12-1" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                  <div class="g-overflow-x-scroll g-overflow-x-visible--lg">
                    <table class="text-center w-100">
                      <thead class="h6 g-brd-bottom g-brd-gray-light-v3 g-color-black text-uppercase">
                        <tr>
                          <th class="g-font-weight-400 g-width-50 g-pb-20">번호</th>
                          <th class="g-font-weight-400 text-center g-pb-20">내용</th>
                          <th class="g-font-weight-400 g-width-50 g-pb-20">작성자</th>
                          <th class="g-font-weight-400 g-width-50 g-pb-20">조회</th>
                        </tr>
                      </thead>

                      <tbody>
                        <!-- Item-->
                        
                        <tr class="g-brd-bottom g-brd-gray-light-v3">
                          
                          <td class="g-width-50 g-py-20">&nbsp;&nbsp;1&nbsp;&nbsp;</td>
                          
                          <td class="text-left g-py-25">
                            <a href="page-category.jsp">
                              <img class="d-inline-block g-width-100 mr-4" src="${pageContext.request.contextPath}/html/namdo-market/assets/img-temp/150x150/img6.jpg" alt="Image Description">
                            </a>
                            <div class="d-inline-block align-middle">
                              <h4 class="h6 g-color-black">
                                <a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover" href="page-qna.jsp">상품 Q&amp;A입니다.</a>
                              </h4>
                            </div>
                            
                          </td>
                          
                          <td class="g-color-gray-dark-v2 g-font-size-13">오지원</td>
                          <td class="g-color-gray-dark-v2 g-font-size-13">2</td>
                          
                        </tr>
                        
                        <!-- End Item-->

						<!-- Item-->
                        <tr class="g-brd-bottom g-brd-gray-light-v3">
                          <td class="g-width-50 g-py-20">&nbsp;&nbsp;2&nbsp;&nbsp;</td>
                          <td class="text-left g-py-25">
                            <a href="page-category.jsp">
                              <img class="d-inline-block g-width-100 mr-4" src="${pageContext.request.contextPath}/html/namdo-market/assets/img-temp/150x150/img3.jpg" alt="Image Description">
                            </a>
                            <div class="d-inline-block align-middle">
                              <h4 class="h6 g-color-black">
                                <a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover" href="page-category.jsp">상품 Q&amp;A입니다.</a>
                              </h4>
                            </div>
                          </td>
                          <td class="g-color-gray-dark-v2 g-font-size-13">김성은</td>
                          <td class="g-color-gray-dark-v2 g-font-size-13">3</td>
                        </tr>
                        <!-- End Item-->
                        
                        <!-- Item-->
                        <tr class="g-brd-bottom g-brd-gray-light-v3">
                          <td class="g-width-50 g-py-20">&nbsp;&nbsp;3&nbsp;&nbsp;</td>
                          <td class="text-left g-py-25">
                            <a href="page-category.jsp">
                              <img class="d-inline-block g-width-100 mr-4" src="${pageContext.request.contextPath}/html/namdo-market/assets/img-temp/150x150/img7.jpg" alt="Image Description">
                            </a>
                            <div class="d-inline-block align-middle">
                              <h4 class="h6 g-color-black">
                                <a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover" href="page-category.jsp">상품 Q&amp;A입니다.</a>
                              </h4>
                            </div>
                          </td>
                          <td class="g-color-gray-dark-v2 g-font-size-13">조현아</td>
                          <td class="g-color-gray-dark-v2 g-font-size-13">1</td>
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
		                <a class="u-link-v5 g-color-main g-color-primary--hover g-font-weight-600" href="#">Q&amp;A 등록하기</a>
		                <p>궁금한 점이 있다면 뭐든지 물어보세요!</p>
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
		                  <input class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 g-brd-primary--hover rounded g-py-13 g-px-15" type="email" placeholder="이메일">
		                </div>
		
		                <div class="col-md-6 form-group g-mb-20">
		                  <input class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 g-brd-primary--hover rounded g-py-13 g-px-15" type="text" placeholder="제목">
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

              <div class="tab-pane fade" id="nav-5-3-primary-ver--3" role="tabpanel">
                <h3 class="h5 g-color-gray-dark-v2 g-mb-30">Managing Your Orders</h3>

                <!-- Accordion -->
                <div id="accordion-12-3" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-3-heading-01" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">1.</span>
                      Cancel Items or Orders
                    </div>
                    <div id="accordion-12-3-body-01" class="collapse show" role="tabpanel" aria-labelledby="accordion-12-3-heading-01">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-3-body-01" data-toggle="collapse" data-parent="#accordion-12-3" aria-expanded="false" aria-controls="accordion-12-3-body-01">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-3-heading-02" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">2.</span>
                      Change Your Order Information
                    </div>
                    <div id="accordion-12-3-body-02" class="collapse" role="tabpanel" aria-labelledby="accordion-12-3-heading-02">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-3-body-02" data-toggle="collapse" data-parent="#accordion-12-3" aria-expanded="false" aria-controls="accordion-12-3-body-02">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-3-heading-03" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">3.</span>
                      Contact Third-Party Sellers
                    </div>
                    <div id="accordion-12-3-body-03" class="collapse" role="tabpanel" aria-labelledby="accordion-12-3-heading-03">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        The time has come to bring those ideas and plans to life. Sifting through teaspoons of clay and sand scraped from the floors of caves, German researchers have managed to isolate ancient human DNA — without turning up a single bone. Their new technique, described in a study published on Thursday in the journal Science, promises to open new avenues of research into human prehistory and was met with excitement by geneticists and archaeologists.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-3-body-03" data-toggle="collapse" data-parent="#accordion-12-3" aria-expanded="false" aria-controls="accordion-12-3-body-03">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->
                </div>
                <!-- End Accordion -->
              </div>

              <div class="tab-pane fade" id="nav-5-3-primary-ver--4" role="tabpanel">
                <h3 class="h5 g-color-gray-dark-v2 g-mb-30">Account Settings &amp; Payment Methods</h3>

                <!-- Accordion -->
                <div id="accordion-12-4" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-4-heading-01" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">1.</span>
                      End Your Amazon Prime Membership
                    </div>
                    <div id="accordion-12-4-body-01" class="collapse show" role="tabpanel" aria-labelledby="accordion-12-4-heading-01">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-4-body-01" data-toggle="collapse" data-parent="#accordion-12-4" aria-expanded="false" aria-controls="accordion-12-4-body-01">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-4-heading-02" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">2.</span>
                      About Problems Signing In
                    </div>
                    <div id="accordion-12-4-body-02" class="collapse" role="tabpanel" aria-labelledby="accordion-12-4-heading-02">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-4-body-02" data-toggle="collapse" data-parent="#accordion-12-4" aria-expanded="false" aria-controls="accordion-12-4-body-02">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-4-heading-03" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">3.</span>
                      Manage Your Address Book
                    </div>
                    <div id="accordion-12-4-body-03" class="collapse" role="tabpanel" aria-labelledby="accordion-12-4-heading-03">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        The time has come to bring those ideas and plans to life. Sifting through teaspoons of clay and sand scraped from the floors of caves, German researchers have managed to isolate ancient human DNA — without turning up a single bone. Their new technique, described in a study published on Thursday in the journal Science, promises to open new avenues of research into human prehistory and was met with excitement by geneticists and archaeologists.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-4-body-03" data-toggle="collapse" data-parent="#accordion-12-4" aria-expanded="false" aria-controls="accordion-12-4-body-03">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->
                </div>
                <!-- End Accordion -->
              </div>

              <div class="tab-pane fade" id="nav-5-3-primary-ver--5" role="tabpanel">
                <h3 class="h5 g-color-gray-dark-v2 g-mb-30">Returns &amp; Refunds</h3>

                <!-- Accordion -->
                <div id="accordion-12-5" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-5-heading-01" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">1.</span>
                      Return Items You Ordered
                    </div>
                    <div id="accordion-12-5-body-01" class="collapse show" role="tabpanel" aria-labelledby="accordion-12-5-heading-01">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-5-body-01" data-toggle="collapse" data-parent="#accordion-12-5" aria-expanded="false" aria-controls="accordion-12-5-body-01">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-5-heading-02" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">2.</span>
                      Check the Status of Your Refund
                    </div>
                    <div id="accordion-12-5-body-02" class="collapse" role="tabpanel" aria-labelledby="accordion-12-5-heading-02">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-5-body-02" data-toggle="collapse" data-parent="#accordion-12-5" aria-expanded="false" aria-controls="accordion-12-5-body-02">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-5-heading-03" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">3.</span>
                      Return Kindle eBooks
                    </div>
                    <div id="accordion-12-5-body-03" class="collapse" role="tabpanel" aria-labelledby="accordion-12-5-heading-03">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        The time has come to bring those ideas and plans to life. Sifting through teaspoons of clay and sand scraped from the floors of caves, German researchers have managed to isolate ancient human DNA — without turning up a single bone. Their new technique, described in a study published on Thursday in the journal Science, promises to open new avenues of research into human prehistory and was met with excitement by geneticists and archaeologists.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-5-body-03" data-toggle="collapse" data-parent="#accordion-12-5" aria-expanded="false" aria-controls="accordion-12-5-body-03">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->
                </div>
                <!-- End Accordion -->
              </div>

              <div class="tab-pane fade" id="nav-5-3-primary-ver--6" role="tabpanel">
                <h3 class="h5 g-color-gray-dark-v2 g-mb-30">Shipping Policies</h3>

                <!-- Accordion -->
                <div id="accordion-12-6" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-6-heading-01" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">1.</span>
                      Shipping Rates &amp; Times
                    </div>
                    <div id="accordion-12-6-body-01" class="collapse show" role="tabpanel" aria-labelledby="accordion-12-6-heading-01">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-6-body-01" data-toggle="collapse" data-parent="#accordion-12-6" aria-expanded="false" aria-controls="accordion-12-6-body-01">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-6-heading-02" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">2.</span>
                      International Shipping
                    </div>
                    <div id="accordion-12-6-body-02" class="collapse" role="tabpanel" aria-labelledby="accordion-12-6-heading-02">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-6-body-02" data-toggle="collapse" data-parent="#accordion-12-6" aria-expanded="false" aria-controls="accordion-12-6-body-02">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-6-heading-03" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">3.</span>
                      Unify Prime
                    </div>
                    <div id="accordion-12-6-body-03" class="collapse" role="tabpanel" aria-labelledby="accordion-12-6-heading-03">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        The time has come to bring those ideas and plans to life. Sifting through teaspoons of clay and sand scraped from the floors of caves, German researchers have managed to isolate ancient human DNA — without turning up a single bone. Their new technique, described in a study published on Thursday in the journal Science, promises to open new avenues of research into human prehistory and was met with excitement by geneticists and archaeologists.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-6-body-03" data-toggle="collapse" data-parent="#accordion-12-6" aria-expanded="false" aria-controls="accordion-12-6-body-03">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->
                </div>
                <!-- End Accordion -->
              </div>

              <div class="tab-pane fade" id="nav-5-3-primary-ver--7" role="tabpanel">
                <h3 class="h5 g-color-gray-dark-v2 g-mb-30">Other Topics</h3>

                <!-- Accordion -->
                <div id="accordion-12-7" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-7-heading-01" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">1.</span>
                      Gifts, Gift Cards &amp; Registries
                    </div>
                    <div id="accordion-12-7-body-01" class="collapse show" role="tabpanel" aria-labelledby="accordion-12-7-heading-01">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-7-body-01" data-toggle="collapse" data-parent="#accordion-12-7" aria-expanded="false" aria-controls="accordion-12-7-body-01">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-7-heading-02" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">2.</span>
                      Security &amp; Privacy
                    </div>
                    <div id="accordion-12-7-body-02" class="collapse" role="tabpanel" aria-labelledby="accordion-12-7-heading-02">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-7-body-02" data-toggle="collapse" data-parent="#accordion-12-7" aria-expanded="false" aria-controls="accordion-12-7-body-02">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-7-heading-03" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">3.</span>
                      Author, Publisher &amp; Vendor Guides
                    </div>
                    <div id="accordion-12-7-body-03" class="collapse" role="tabpanel" aria-labelledby="accordion-12-7-heading-03">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        The time has come to bring those ideas and plans to life. Sifting through teaspoons of clay and sand scraped from the floors of caves, German researchers have managed to isolate ancient human DNA — without turning up a single bone. Their new technique, described in a study published on Thursday in the journal Science, promises to open new avenues of research into human prehistory and was met with excitement by geneticists and archaeologists.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-7-body-03" data-toggle="collapse" data-parent="#accordion-12-5" aria-expanded="false" aria-controls="accordion-12-5-body-03">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-7-heading-04" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">4.</span>
                      Pricing
                    </div>
                    <div id="accordion-12-7-body-04" class="collapse" role="tabpanel" aria-labelledby="accordion-12-7-heading-04">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        The time has come to bring those ideas and plans to life. Sifting through teaspoons of clay and sand scraped from the floors of caves, German researchers have managed to isolate ancient human DNA — without turning up a single bone. Their new technique, described in a study published on Thursday in the journal Science, promises to open new avenues of research into human prehistory and was met with excitement by geneticists and archaeologists.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-7-body-04" data-toggle="collapse" data-parent="#accordion-12-5" aria-expanded="false" aria-controls="accordion-12-5-body-04">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-7-heading-05" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">5.</span>
                      Placing an Order
                    </div>
                    <div id="accordion-12-7-body-05" class="collapse" role="tabpanel" aria-labelledby="accordion-12-7-heading-05">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        The time has come to bring those ideas and plans to life. Sifting through teaspoons of clay and sand scraped from the floors of caves, German researchers have managed to isolate ancient human DNA — without turning up a single bone. Their new technique, described in a study published on Thursday in the journal Science, promises to open new avenues of research into human prehistory and was met with excitement by geneticists and archaeologists.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-7-body-05" data-toggle="collapse" data-parent="#accordion-12-5" aria-expanded="false" aria-controls="accordion-12-5-body-05">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-7-heading-06" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">6.</span>
                      Sales Tax &amp; Regulatory Fees
                    </div>
                    <div id="accordion-12-7-body-06" class="collapse" role="tabpanel" aria-labelledby="accordion-12-7-heading-06">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        The time has come to bring those ideas and plans to life. Sifting through teaspoons of clay and sand scraped from the floors of caves, German researchers have managed to isolate ancient human DNA — without turning up a single bone. Their new technique, described in a study published on Thursday in the journal Science, promises to open new avenues of research into human prehistory and was met with excitement by geneticists and archaeologists.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-7-body-06" data-toggle="collapse" data-parent="#accordion-12-5" aria-expanded="false" aria-controls="accordion-12-5-body-06">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-7-heading-07" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">7.</span>
                      Promotions &amp; Deals
                    </div>
                    <div id="accordion-12-7-body-07" class="collapse" role="tabpanel" aria-labelledby="accordion-12-7-heading-07">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        The time has come to bring those ideas and plans to life. Sifting through teaspoons of clay and sand scraped from the floors of caves, German researchers have managed to isolate ancient human DNA — without turning up a single bone. Their new technique, described in a study published on Thursday in the journal Science, promises to open new avenues of research into human prehistory and was met with excitement by geneticists and archaeologists.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-7-body-07" data-toggle="collapse" data-parent="#accordion-12-5" aria-expanded="false" aria-controls="accordion-12-5-body-07">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->
                </div>
                <!-- End Accordion -->
              </div>

              <div class="tab-pane fade" id="nav-5-3-primary-ver--8" role="tabpanel">
                <h3 class="h5 g-color-gray-dark-v2 g-mb-30">Need more help?</h3>

                <!-- Accordion -->
                <div id="accordion-12-8" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-8-heading-01" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">1.</span>
                      Ask the unify Help Community
                    </div>
                    <div id="accordion-12-8-body-01" class="collapse show" role="tabpanel" aria-labelledby="accordion-12-8-heading-01">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-8-body-01" data-toggle="collapse" data-parent="#accordion-12-8" aria-expanded="false" aria-controls="accordion-12-8-body-01">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->

                  <!-- Card -->
                  <div class="card g-brd-none g-brd-bottom g-brd-gray-light-v3 rounded-0 g-pb-30 g-mb-30">
                    <div id="accordion-12-8-heading-02" class="u-accordion__header g-color-gray-dark-v4 g-font-weight-500 g-font-size-16 g-pa-0" role="tab">
                      <span class="g-color-primary g-font-weight-700 g-font-size-16 g-line-height-1_2">2.</span>
                      Contact Us
                    </div>
                    <div id="accordion-12-8-body-02" class="collapse" role="tabpanel" aria-labelledby="accordion-12-8-heading-02">
                      <div class="u-accordion__body g-color-gray-dark-v4">
                        This is where we sit down, grab a cup of coffee and dial in the details. Understanding the task at hand and ironing out the wrinkles is key. Now that we've aligned the details, it's time to get things mapped out and organized. This part is really crucial in keeping the project in line to completion.
                      </div>
                    </div>
                    <h5 class="g-font-weight-400 g-font-size-13 g-pl-8 mt-3 mb-0">
                      <a class="collapsed g-color-primary g-text-underline--none--hover g-pa-10" href="#accordion-12-8-body-02" data-toggle="collapse" data-parent="#accordion-12-8" aria-expanded="false" aria-controls="accordion-12-8-body-02">
                        <span class="u-accordion__control-icon">
                          <i class="g-font-style-normal">Read More
                            <span class="ml-2 fa fa-caret-up"></span>
                          </i>
                          <i class="g-font-style-normal">Read Less
                            <span class="ml-2 fa fa-caret-down"></span>
                          </i>
                        </span>
                      </a>
                    </h5>
                  </div>
                  <!-- End Card -->
                </div>
                <!-- End Accordion -->
              </div>
            </div>
            <!-- End Tab panes -->
          </div>
          
        </div>

        
      </div>
      <!-- End Help -->

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
    <script src="${pageContext.request.contextPath}/html/assets/vendor/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/jquery-migrate/jquery-migrate.min.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/popper.js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/bootstrap/bootstrap.min.js"></script>

    <!-- JS Implementing Plugins -->
    <script src="${pageContext.request.contextPath}/html/assets/vendor/hs-megamenu/src/hs.megamenu.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>

    <!-- JS Unify -->
    <script src="${pageContext.request.contextPath}/html/assets/js/hs.core.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.header.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/helpers/hs.hamburgers.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.dropdown.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.scrollbar.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.go-to.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.tabs.js"></script>

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
