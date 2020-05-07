<!DOCTYPE html>
<html>
<head>
<title>Facebook Login </title>
<meta charset="UTF-8">
</head>
<body a>
    
<script>
 // This is called with the results from from FB.getLoginStatus().
 function statusChangeCallback(response) {
 console.log('statusChangeCallback');
 console.log(response);
 console.log(response.authResponse.accessToken);
 alert(response.authResponse.accessToken);
 if (response.status === 'connected') {
 window.location.href='Sign_in_Controller.jsp?access_token='+response.authResponse.accessToken; 
 } else {
 // The person is not logged into your app or we are unable to tell.
 document.getElementById('status').innerHTML = 'Please log ' +
 'into this app.';
 }
 }
 // This function is called when someone finishes with the Login
 // Button. See the onlogin handler attached to it in the sample
 // code below.
 function checkLoginState() {
 FB.getLoginStatus(function(response) {
 statusChangeCallback(response);
 });
 }
 window.fbAsyncInit = function() {
 FB.init({
 appId : '229228558329764',
 cookie : true, // enable cookies to allow the server to access 
 // the session
 xfbml : true, // parse social plugins on this page
 version : 'v2.8' // use graph api version 2.8
 });
 FB.getLoginStatus(function(response) {
 statusChangeCallback(response);
 });
 };
 // Load the SDK asynchronously
 (function(d, s, id) {
 var js, fjs = d.getElementsByTagName(s)[0];
 if (d.getElementById(id)) return;
 js = d.createElement(s); js.id = id;
 js.src = "https://connect.facebook.net/es_ES/sdk.js#xfbml=1&version=v6.0&appId=181275696504849&autoLogAppEvents=1";
 fjs.parentNode.insertBefore(js, fjs);
 }(document, 'script', 'facebook-jssdk'));
 // Here we run a very simple test of the Graph API after login is
 // successful. See statusChangeCallback() for when this call is made.
</script>
<fb:login-button scope="public_profile,email,link" onlogin="checkLoginState();" aling="center"  >
</fb:login-button>
<div id="status">
</div>

</body>
</html>