<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
<script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js" charset="utf-8"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
</head>
<body>
<script type="text/javascript">
  var naver_id_login = new naver_id_login("vYLffYO2LmDOeGspAqNa", "http://localhost:8000/team3_2nd_project/html/namdo-market/naverLoginCallback.jsp");
  // 접근 토큰 값 출력
  // 네이버 사용자 프로필 조회
  naver_id_login.get_naver_userprofile("naverSignInCallback()");
  
  // 네이버 사용자 프로필 조회 이후 프로필 정보를 처리할 callback function
  function naverSignInCallback() {
	    var birthyear = naver_id_login.getProfileData('birthyear');
        var birthday = naver_id_login.getProfileData('birthday');
	    var name = naver_id_login.getProfileData('name');
	    var email = naver_id_login.getProfileData('email');
	    var id = naver_id_login.getProfileData('id');
	    var mobile = naver_id_login.getProfileData('mobile');
        opener.document.location.href = "${pageContext.request.contextPath}/customerNaverLoginServlet?name="+name+"&naverId="+id+"&naverEmail="+email+"&birthyear="+birthyear+"&birthday="+birthday+"&mobile="+mobile;
        self.close();
        
        //AAAANkLBchwB8saYe58-z4Btv2dCpysS07SLxbvfecu7rRG3imaQwanJZ-S6B7UmCH0EAHjsIpG1ap9KD-VgT5kRN4E
    //WypdOU4mmMafVYOI6YCgKHWRPtE5lBudo4poIS-FgHE   ==>tjdt11
    //BDkIxUWxxYYocad2BQRul-xvG3qeY4KXJz5m5Y1C34s   ==>ai_tjdt11
  }
</script>
</body>
</html>