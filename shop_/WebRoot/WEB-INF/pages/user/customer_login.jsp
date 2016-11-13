<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<script language="javascript">
 function checkIn(){
    if(form1.username.value=="")
	{
	     alert("请输入用户名");
		 return false;
	}
	 if(form1.password.value=="")
	 {
	     alert("请输入密码");
		 return false;
	 }	 
	 
	return true;
 }
</script>
</head>
<body>
<%@ include file="/WEB-INF/pages/common/head.jsp"%>
<div id="box">
<div id="mid">
    <div id="denglu">
    <s:fielderror></s:fielderror>
      <s:form action="customer_logon" namespace="/customer" method="post">
      <table width="100%" height="94" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td width="70" height="35" align="right">会员名：</td>
          <td width="121" align="left">
          <s:textfield name="username" cssClass="bian" size="18"></s:textfield>
          </td>
        </tr>
        <tr>
          <td height="35" align="right">密　码：</td>
          <td align="left">
          <s:password name="password" cssClass="bian" size="18"></s:password>
          </td>
        </tr>
        <tr>
          <td height="24" colspan="2" align="center">
          <s:submit value="登　录" type="image" src="%{context_path}/css/images/dl_06.gif"></s:submit>　　
          <s:a action="customer_reg" namespace="/customer">
          <img src="${context_path}/css/images/dl_08.gif" width="68" height="24" />
          </s:a>
          </td>
        </tr>
      </table>
      </s:form>
      <br>
      <br>
      <br>
      <br>
      <a href="http://127.0.0.1:8081/shop_/admin/admin_main.html" >后台登陆</a>
      <hr>
    </div>
  </div>
 
</div>






<div id="box">
<div id="mid">
    <div id="denglu">
    <s:fielderror></s:fielderror>
      <s:form action="customer_logon" namespace="/customer" method="post" id="form1">
      <table width="100%" height="94" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td width="70" height="35" align="right">会员名：</td>
          <td width="121" align="left">
          <s:textfield name="username" cssClass="bian" size="18"></s:textfield>
          </td>
        </tr>
        <tr>
          <td height="35" align="right">密　码：</td>
          <td align="left">
          <s:password name="password" cssClass="bian" size="18"></s:password>
          </td>
        </tr>
        <tr>
          <td height="24" colspan="2" align="center">
          <s:submit  onclick="return checkIn()" value="登　录" type="image" src="%{context_path}/css/images/dl_06.gif"></s:submit>　　
          <s:a action="customer_reg" namespace="/customer">
          <img src="${context_path}/css/images/dl_08.gif" width="68" height="24" />
          </s:a>
          </td>
        </tr>
      </table>
      </s:form>
     
      <hr>
    </div>
  </div>
  <div id="foot"></div>
</div>
</body>
</html>