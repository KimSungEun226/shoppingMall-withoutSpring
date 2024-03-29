<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
  <!-- Header -->
      <header id="js-header" class="u-header u-header--static u-shadow-v19">
      <!-- Top Bar -->
        <div class="u-header__section g-brd-bottom g-brd-gray-light-v4 g-transition-0_3">
          <div class="container">
            <div class="row justify-content-between align-items-center g-mx-0--lg">
              <div class="col-12 col-sm-auto order-sm-2 g-py-5 g-py-20--sm text-center">
                <!-- Logo -->
                <a class="navbar-brand" href="${pageContext.request.contextPath}/html/namdo-market/home-page.jsp">
                  <img src="${pageContext.request.contextPath}/html/namdo-market/assets/img/logo/logo-1.png" alt="Image Description">
                </a>
                <!-- End Logo -->
              </div>

              <div class="col-6 col-sm-auto order-sm-1 g-pl-0--sm g-py-5 g-py-20--sm">
                <!-- Search -->
                <div class="d-inline-block g-valign-middle">
                  <div class="g-py-10 g-pr-40">
                    <a class="g-color-text g-color-black--hover g-color-black--focus g-font-size-16 g-text-underline--none--hover" href="#"
                       aria-haspopup="true"
                       aria-expanded="false"
                       aria-controls="searchform-1"
                       data-dropdown-event="hover"
                       data-dropdown-target="#searchform-1"
                       data-dropdown-type="css-animation"
                       data-dropdown-duration="300"
                       data-dropdown-animation-in="fadeInUp"
                       data-dropdown-animation-out="fadeOutDown">
                      <i class="align-middle mr-2 icon-education-045 u-line-icon-pro"></i>
                      <span class="g-font-size-default g-pos-rel g-top-minus-2">검색</span>
                    </a>
                  </div>

                  <!-- Search Form -->
                  <form id="searchform-1" class="u-searchform-v1 u-dropdown--css-animation u-dropdown--hidden u-shadow-v20 g-max-width-400 g-brd-around g-brd-gray-light-v4 g-bg-white rounded g-left-0 g-pa-10">
                    <div class="input-group">
                      <input class="form-control rounded-0 u-form-control border-0 g-font-size-13 g-py-12" type="search">
                      <div class="input-group-addon g-brd-none p-0">
                        <button class="btn u-btn-primary g-font-size-12 rounded text-uppercase g-py-12 g-px-15" type="submit">검색</button>
                      </div>
                    </div>
                  </form>
                  <!-- End Search Form -->
                </div>
                <!-- End Search -->
              </div>

              <div class="col-6 col-sm-auto order-sm-3 g-py-5 g-pr-0 g-py-20--sm">
                <!-- Login -->
                <div class="d-inline-block">
                  <i class="text-right u-icon-v1 g-color-text g-color-black--hover g-color-black--focus g-font-size-15 g-text-underline--none--hover icon-finance-067 u-line-icon-pro"></i>
                  <a id="account-dropdown-invoker-2" class="g-color-black-opacity-0_6 g-color-primary--hover g-font-size-15 g-font-weight-400 g-text-underline--none--hover" href="${pageContext.request.contextPath}/html/namdo-market/page-login-customer.jsp">
                  로그인
                  </a>
                </div>
                <!-- End Login -->

                
              </div>
            </div>
          </div>
        </div>
        <!-- End Top Bar -->

        <div class="u-header__section u-header__section--light g-bg-white g-transition-0_3">
          <nav class="js-mega-menu navbar navbar-expand-lg">
            <div class="container">
              <!-- Responsive Toggle Button -->
              <button type="button" class="navbar-toggler navbar-toggler-right btn ml-auto g-line-height-1 g-brd-none g-pa-0"
                      aria-label="Toggle navigation"
                      aria-expanded="false"
                      aria-controls="navBar"
                      data-toggle="collapse"
                      data-target="#navBar">
                <span class="hamburger hamburger--slider">
                  <span class="hamburger-box">
                    <span class="hamburger-inner"></span>
                  </span>
                </span>
              </button>
              <!-- End Responsive Toggle Button -->

              <!-- 카테고리 -->
              <div id="navBar" class="collapse navbar-collapse align-items-center flex-sm-row">
                <ul class="navbar-nav mx-auto">
                
                <!-- 전체 카테고리 -->
                  <li class="hs-has-mega-menu nav-item g-mx-10--lg g-mx-15--xl"
                      data-animation-in="fadeIn"
                      data-animation-out="fadeOut"
                      data-position="right">
                    <a id="mega-menu-label-4" class="nav-link text-uppercase g-color-primary--hover g-px-5 g-py-20" href="${pageContext.request.contextPath}/front?key=item&methodName=selectAll" aria-haspopup="true" aria-expanded="false">
                      <b>전체</b>
                      <i class="hs-icon hs-icon-arrow-bottom g-font-size-11 g-ml-7"></i>
                    </a>

                    <!-- 전체 카테고리 메뉴 -->
                    <div class="w-100 hs-mega-menu u-shadow-v11 g-text-transform-none g-brd-top g-brd-primary g-brd-top-2 g-bg-white g-pa-30 g-mt-7" aria-labelledby="mega-menu-label-4">
                      <div class="row">
                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">
                          <!-- Links -->
                          <span class="d-block g-font-weight-500 text-uppercase mb-2">
							<a class="nav-link text-uppercase g-color-primary--hover g-px-0 g-py-0" href="#"><b>지역별 특산품</b></a>
						  </span>

                          <ul class="list-unstyled mb-0">
                            <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">강진군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=14">고흥군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">곡성군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">광양시</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">구례군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">나주시</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">담양군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=2">목포시</a></li>
                              
                              
                          </ul>
                          <!-- End Links -->
                        </div>
                        
                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">
                          <!-- Links -->
                          <span class="d-block g-font-weight-500 text-uppercase mb-2"><br></span>

                          <ul class="list-unstyled mb-0">
                            <li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=3">무안군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=4">보성군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">순천시</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=6">신안군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=7">여수시</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=1">영광군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">영암군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=8">완도군</a></li>
                          </ul>
                          <!-- End Links -->
                        </div>
                        
                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">
                          <!-- Links -->
                          <span class="d-block g-font-weight-500 text-uppercase mb-2"><br></span>

                          <ul class="list-unstyled mb-0">
                            <li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">장성군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">장흥군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=11">진도군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">화순군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=9">해남군</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">함평군</a></li>
                          </ul>
                          <!-- End Links -->
                        </div>
                        
                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">
                          <!-- Links -->
                          
                            <div class="mb-5">
                              <span class="d-block g-font-weight-500 text-uppercase mb-2">
							    <a class="nav-link text-uppercase g-color-primary--hover g-px-0 g-py-0" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=1"><b>생선</b></a>
							  </span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=굴비">굴비</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=낙지">낙지</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=홍어">홍어</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=장어">장어</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->
                          
                          <!-- Links -->
                          <div class="mb-1">
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
							  <a class="nav-link text-uppercase g-color-primary--hover g-px-0 g-py-0" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=2"><b>건어물</b></a>
							</span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=멸치">멸치</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=황태채">황태채</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->
                          
                          
                        </div>
                        
                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">
                          
                          <!-- Links -->
                            <div class="mb-5">
                              <span class="d-block g-font-weight-500 text-uppercase mb-2">
								<a class="nav-link text-uppercase g-color-primary--hover g-px-0 g-py-0" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=3"><b>김/해초류</b></a>
							  </span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=김">김</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=미역">미역</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->
                          
                          <!-- Links -->
                          <div class="mb-1">
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
							  <a class="nav-link text-uppercase g-color-primary--hover g-px-0 g-py-0" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=4"><b>해산물/어패류</b></a>
							</span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=전복">전복</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=바지락">바지락</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=꼬막">꼬막</a></li>
                              <li><a class="d-block g-color-text g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=새우">새우</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->
                          </div>

                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">
                          <!-- Links -->
                          <div class="mb-5">
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
                              <a class="nav-link text-uppercase g-color-primary--hover g-px-0 g-py-0" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=5"><b>젓갈</b></a>
                            </span>
                   
                          </div>
                          <!-- End Links -->
                          
                          <!-- Links -->
                          <div class="mb-5">
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
							  <a class="nav-link text-uppercase g-color-primary--hover g-px-0 g-py-0" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=6"><b>수산물 기타</b></a>
							</span>

                          </div>
                          <!-- End Links -->

                          <!-- Links -->
                          <div class="mb-1">
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
							  <a class="nav-link text-uppercase g-color-primary--hover g-px-0 g-py-0" href="${pageContext.request.contextPath}/front"><b>고객센터</b><span class="u-label g-bg-primary rounded g-ml-10">New</span></a>
						    </span>
						  </div>
                        </div>
                      </div>
                    </div>
                    
                    <!-- End Mega Menu -->
                  </li>
                  <!-- 전체 카테고리 끝 -->
                  
                  <!-- 지역별 특산품 -->
                  <li class="hs-has-mega-menu nav-item g-mx-10--lg g-mx-15--xl"
                      data-animation-in="fadeIn"
                      data-animation-out="fadeOut"
                      data-position="right">
                    <a id="mega-menu-label-4" class="nav-link text-uppercase g-color-primary--hover g-px-5 g-py-20" href="#" aria-haspopup="true" aria-expanded="false">
                      <b>지역별 특산품</b>
                      <i class="hs-icon hs-icon-arrow-bottom g-font-size-11 g-ml-7"></i>
                    </a>

                    <!-- 지역별 특산품 메뉴 -->
                    <div class="w-100 hs-mega-menu u-shadow-v11 g-text-transform-none g-brd-top g-brd-primary g-brd-top-2 g-bg-white g-pa-30 g-mt-7" aria-labelledby="mega-menu-label-4">
                      <div class="row">
                        
                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">
                         
                          <!-- ㄱ Links -->
                          
                          <div class="mb-5">
                          
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
							  <a class="text-uppercase g-font-size-14 g-px-0 g-py-0"><b>ㄱ</b></a>
							</span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">강진군</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=14">고흥군</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">곡성군</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">광양시</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">구례군</a></li>
                            </ul>
                          </div>
                          <!-- End Links -->
                          
                          <!-- ㄴ Links -->
                          <div class="mb-0">
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
							  <a class="text-uppercase g-font-size-14 g-px-0 g-py-0"><b>ㄴ</b></a>
							</span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">나주시</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->

                        </div>
                        
                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">
                          
                          
                          <!-- ㄷ Links -->
                          <div class="mb-5">
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
							  <a class="text-uppercase g-font-size-14 g-px-0 g-py-0"><b>ㄷ</b></a>
							</span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">담양군</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->
                          
                          
                          <!-- ㅁ Links -->
                          
                            <div class="mb-5">
                              <span class="d-block g-font-weight-500 text-uppercase mb-2">
							    <a class="text-uppercase g-font-size-14 g-px-0 g-py-0"><b>ㅁ</b></a>
							  </span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=2">목포시</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=3">무안군</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->

                        </div>
                        
                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">

                          <!-- ㅂ Links -->
                          <div class="mb-5">
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
							  <a class="text-uppercase g-font-size-14 g-px-0 g-py-0"><b>ㅂ</b></a>
							</span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=4">보성군</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->

						  <!-- ㅅ Links -->
                            <div class="mb-2">
                              <span class="d-block g-font-weight-500 text-uppercase mb-2">
								<a class="text-uppercase g-font-size-14 g-px-0 g-py-0"><b>ㅅ</b></a>
							  </span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">순천시</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=6">신안군</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->
                        </div>

                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">
                          <!--  Links -->
                          <div class="mb-2">
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
							  <a class="text-uppercase g-font-size-14 g-px-0 g-py-0"><b>ㅇ</b></a>
							</span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=7">여수시</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=1">영광군</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">영암군</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=8">완도군</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->
                        </div>
                        
                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">
                          <!-- ㅈ Links -->
                          <div class="mb-5">
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
							  <a class="text-uppercase g-font-size-14 g-px-0 g-py-0"><b>ㅈ</b></a>
							</span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">장성군</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">장흥군</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=11">진도군</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->
						</div>
                        <div class="col-sm-6 col-md-2 g-mb-30 g-mb-0--sm">
                          <!-- ㅎ Links -->
                          <div class="mb-2">
                            <span class="d-block g-font-weight-500 text-uppercase mb-2">
							  <a class="text-uppercase g-font-size-14 g-px-0 g-py-0"><b>ㅎ</b></a>
							</span>

                            <ul class="list-unstyled mb-0">
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">화순군</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByRegionNo&regionNo=9">해남군</a></li>
                              <li><a class="d-block g-color-text g-font-size-14 g-color-primary--hover g-text-underline--none--hover g-py-5" href="#">함평군</a></li>
                             
                            </ul>
                          </div>
                          <!-- End Links -->
                        </div>

                      </div>
                    </div>
                    <!-- End Mega Menu -->
                  </li>
                  <!-- 지역별 특산품 끝 -->

                  <!-- 생선 -->
                  <li class="nav-item hs-has-sub-menu g-mx-10--lg g-mx-15--xl">
                    <a id="nav-link--home" class="nav-link text-uppercase g-color-primary--hover g-px-5 g-py-20" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=1"
                       aria-haspopup="true"
                       aria-expanded="false"
                       aria-controls="nav-submenu--home">
                      <b>생선</b>
                    </a>

                    <!-- Submenu -->
                    <ul id="nav-submenu--home" class="hs-sub-menu list-unstyled u-shadow-v11 g-min-width-220 g-brd-top g-brd-primary g-brd-top-2 g-mt-7"
                        aria-labelledby="nav-link--home">
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=굴비">굴비</a>
                      </li>
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=낙지">낙지</a>
                      </li>
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=홍어">홍어</a>
                      </li>
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=장어">장어</a>
                      </li>
                    </ul>
                    <!-- End Submenu -->
                  </li>
                  <!-- 생선 -->
                  
                  <!-- 건어물 -->
                  <li class="nav-item hs-has-sub-menu g-mx-10--lg g-mx-15--xl">
                    <a id="nav-link--home" class="nav-link text-uppercase g-color-primary--hover g-px-5 g-py-20" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=2"
                       aria-haspopup="true"
                       aria-expanded="false"
                       aria-controls="nav-submenu--home">
                      <b>건어물</b>
                    </a>

                    <!-- Submenu -->
                    <ul id="nav-submenu--home" class="hs-sub-menu list-unstyled u-shadow-v11 g-min-width-220 g-brd-top g-brd-primary g-brd-top-2 g-mt-7"
                        aria-labelledby="nav-link--home">
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=멸치">멸치</a>
                      </li>
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=황태채">황태채</a>
                      </li>
                    </ul>
                    <!-- End Submenu -->
                  </li>
                  <!-- 건어물 -->
                  
                 <!-- 김/해초류 -->
                  <li class="nav-item hs-has-sub-menu g-mx-10--lg g-mx-15--xl">
                    <a id="nav-link--home" class="nav-link text-uppercase g-color-primary--hover g-px-5 g-py-20" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=3"
                       aria-haspopup="true"
                       aria-expanded="false"
                       aria-controls="nav-submenu--home">
                      <b>김/해초류</b>
                    </a>

                    <!-- Submenu -->
                    <ul id="nav-submenu--home" class="hs-sub-menu list-unstyled u-shadow-v11 g-min-width-220 g-brd-top g-brd-primary g-brd-top-2 g-mt-7"
                        aria-labelledby="nav-link--home">
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=김">김</a>
                      </li>
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=미역">미역</a>
                      </li>
                    </ul>
                    <!-- End Submenu -->
                  </li>
                  <!-- 김/해초류 -->
                  
                  <!-- 해산물/어패류 -->
                  <li class="nav-item hs-has-sub-menu g-mx-10--lg g-mx-15--xl">
                    <a id="nav-link--home" class="nav-link text-uppercase g-color-primary--hover g-px-5 g-py-20" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=4"
                       aria-haspopup="true"
                       aria-expanded="false"
                       aria-controls="nav-submenu--home">
                      <b>해산물/어패류</b>
                    </a>

                    <!-- Submenu -->
                    <ul id="nav-submenu--home" class="hs-sub-menu list-unstyled u-shadow-v11 g-min-width-220 g-brd-top g-brd-primary g-brd-top-2 g-mt-7"
                        aria-labelledby="nav-link--home">
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=전복">전복</a>
                      </li>
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=바지락">바지락</a>
                      </li>
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=꼬막">꼬막</a>
                      </li>
                      <li class="dropdown-item">
                        <a class="nav-link g-color-gray-dark-v1" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByInputItemName&input=새우">새우</a>
                      </li>
                    </ul>
                    <!-- End Submenu -->
                  </li>
                  <!-- 해산물/어패류 -->
                    
                  <!-- 젓갈 -->
                  <li class="nav-item g-mx-10--lg g-mx-15--xl">
                    <a class="nav-link text-uppercase g-color-primary--hover g-px-5 g-py-20" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=5"><b>젓갈</b></a>
                  </li>
                  
                  <!-- 수산물 기타 -->
                  <li class="nav-item g-mx-10--lg g-mx-15--xl">
                    <a class="nav-link text-uppercase g-color-primary--hover g-px-5 g-py-20" href="${pageContext.request.contextPath}/front?key=item&methodName=selectByCategoryNo&categoryNo=6"><b>수산물 기타</b></a>
                  </li>

                  <!-- 고객센터 -->
                  <li class="nav-item g-mx-10--lg g-mx-15--xl">

                    <a class="nav-link text-uppercase g-color-primary--hover g-px-5 g-py-20" href="${pageContext.request.contextPath}/front"><b>고객센터</b></a>
                  </li>

                </ul>
              </div>
              <!-- End Navigation -->
            </div>
          </nav>
        </div>
      </header>
      <!-- End Header -->
</body>
</html>