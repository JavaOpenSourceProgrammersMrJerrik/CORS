--本地host改成如下方式(不同域名,ajax请求默认不能跨域)
127.0.0.1 test.mangocity.com
127.0.0.1 test1.mango.com


#step 1
visit http://test.mangocity.com:port/Requester

#step 2
click 发送ajax请求  请求url:http://test1.mango.com:8080/Receivor/login


Request URL:http://test1.mango.com:8080/Receivor/login
Request Method:POST
Status Code:200 OK
Remote Address:127.0.0.1:8080

   Response Headers
Access-Control-Allow-Headers:x-requested-with,content-type
Access-Control-Allow-Methods:post
Access-Control-Allow-Origin:http://test.mangocity.com:8080


Content-Type:application/json;charset=UTF-8
Date:Thu, 28 Jul 2016 14:27:41 GMT
Server:Apache-Coyote/1.1
Transfer-Encoding:chunked