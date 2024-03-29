<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
  <!-- Header -->
      <header id="js-header" class="u-header u-header--static u-shadow-v19">
        <!-- Top Bar -->
        <div class="u-header__section g-brd-bottom g-brd-gray-light-v4 g-bg-black g-transition-0_3">
          <div class="container">
            <div class="row justify-content-between align-items-center g-mx-0--lg">
              

              <div class="col-sm-auto g-hidden-sm-down g-color-white-opacity-0_6 g-font-weight-400 g-pl-15 g-pl-0--sm g-py-14">
                <i class="icon-communication-163 u-line-icon-pro g-font-size-18 g-valign-middle g-color-white-opacity-0_8 g-mr-10 g-mt-minus-2"></i>
                010-1234-4321
              </div>

              <div class="col-sm-auto g-pos-rel g-py-14">
                
              </div>

              <div class="col-sm-auto g-pos-rel g-py-14">
                <!-- List -->
                <ul class="list-inline g-overflow-hidden g-pt-1 g-mx-minus-4 mb-0">
                  
                  
                </ul>
                <!-- End List -->
              </div>

              <div class="col-sm-auto g-pr-15 g-pr-0--sm">
              
              <!-- Account -->
                  <li class="list-inline-item">
                    <a id="account-dropdown-invoker-2" class="g-color-white-opacity-0_6 g-color-primary--hover g-font-weight-400 g-text-underline--none--hover" href="#"
                       aria-controls="account-dropdown-2"
                       aria-haspopup="true"
                       aria-expanded="false"
                       data-dropdown-event="hover"
                       data-dropdown-target="#account-dropdown-2"
                       data-dropdown-type="css-animation"
                       data-dropdown-duration="300"
                       data-dropdown-hide-on-scroll="false"
                       data-dropdown-animation-in="fadeIn"
                       data-dropdown-animation-out="fadeOut">
                      계정
                    </a>
                    <ul id="account-dropdown-2" class="list-unstyled u-shadow-v29 g-pos-abs g-bg-white g-width-160 g-pb-5 g-mt-19 g-z-index-2"
                        aria-labelledby="account-dropdown-invoker-2">
                      <li>
                        <a class="d-block g-color-black g-color-primary--hover g-text-underline--none--hover g-font-weight-400 g-py-5 g-px-20" href="${pageContext.request.contextPath}/html/namdo-market/page-login-customer.jsp">
                          로그인
                        </a>
                      </li>
                      <li>
                        <a class="d-block g-color-black g-color-primary--hover g-text-underline--none--hover g-font-weight-400 g-py-5 g-px-20" href="${pageContext.request.contextPath}/html/namdo-market/page-signup-customer.jsp">
                          회원가입
                        </a>
                      </li>
                      
                    </ul>
                  </li>
                  <!-- End Account -->
                <!-- Basket -->
                <div class="u-basket d-inline-block g-z-index-3">
                  <div class="g-py-10 g-px-6">
                    <a href="#" id="basket-bar-invoker" class="u-icon-v1 g-color-white-opacity-0_8 g-color-primary--hover g-font-size-17 g-text-underline--none--hover"
                       aria-controls="basket-bar"
                       aria-haspopup="true"
                       aria-expanded="false"
                       data-dropdown-event="hover"
                       data-dropdown-target="#basket-bar"
                       data-dropdown-type="css-animation"
                       data-dropdown-duration="300"
                       data-dropdown-hide-on-scroll="false"
                       data-dropdown-animation-in="fadeIn"
                       data-dropdown-animation-out="fadeOut">
                      <i class="icon-hotel-restaurant-105 u-line-icon-pro"></i>
                    </a>
                  </div>

                </div>
                <!-- End Basket -->

                <!-- Search -->
                <div class="d-inline-block g-valign-middle">
                  <div class="g-py-10 g-pl-15">
                    <a href="#" class="g-color-white-opacity-0_8 g-color-primary--hover g-font-size-17 g-text-underline--none--hover"
                       aria-haspopup="true"
                       aria-expanded="false"
                       data-dropdown-event="hover"
                       aria-controls="searchform-1"
                       data-dropdown-target="#searchform-1"
                       data-dropdown-type="css-animation"
                       data-dropdown-duration="300"
                       data-dropdown-animation-in="fadeInUp"
                       data-dropdown-animation-out="fadeOutDown">
                      <i class="g-pos-rel g-top-3 icon-education-045 u-line-icon-pro"></i>
                    </a>
                  </div>

                  <!-- Search Form -->
                  <form id="searchform-1" class="u-searchform-v1 u-dropdown--css-animation u-dropdown--hidden u-shadow-v20 g-brd-around g-brd-gray-light-v4 g-bg-white g-right-0 rounded g-pa-10 1g-mt-8">
                    <div class="input-group">
                      <input class="form-control g-font-size-13" type="search" placeholder="Search Here...">
                      <div class="input-group-append p-0">
                        <button class="btn u-btn-primary g-font-size-12 text-uppercase g-py-13 g-px-15" type="submit">Go</button>
                      </div>
                    </div>
                  </form>
                  <!-- End Search Form -->
                </div>
                <!-- End Search -->
              </div>
            </div>
          </div>
        </div>
        <!-- End Top Bar -->

        <div class="u-header__section u-header__section--light g-bg-white g-transition-0_3 g-py-10">
          <nav class="js-mega-menu navbar navbar-expand-lg">
            <div class="container">
              <!-- Responsive Toggle Button -->
              <button class="navbar-toggler navbar-toggler-right btn g-line-height-1 g-brd-none g-pa-0 g-pos-abs g-top-3 g-right-0" type="button"
                      aria-label="Toggle navigation"
                      aria-expanded="false"
                      aria-controls="navBar"
                      data-toggle="collapse"
                      data-target="#navBar">
                <span class="hamburger hamburger--slider g-pr-0">
                  <span class="hamburger-box">
                    <span class="hamburger-inner"></span>
                  </span>
                </span>
              </button>
              <!-- End Responsive Toggle Button -->

              <!-- Logo -->
              <a class="navbar-brand" href="${pageContext.request.contextPath}/html/namdo-market/home-page.jsp">
                <img src="${pageContext.request.contextPath}/html/namdo-market/assets/img/logo/logo-1.png" alt="Image Description">
              </a>
              <!-- End Logo -->

              <!-- Navigation -->
              <div id="navBar" class="collapse navbar-collapse align-items-center flex-sm-row g-pt-15 g-pt-0--lg">
                <ul class="navbar-nav ml-auto">
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
                          <!-- ㅇ Links -->
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



