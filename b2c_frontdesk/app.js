var express = require('express')
var proxy = require('http-proxy-middleware')
var app  = express()
//静态资源直接访问
app.use(express.static('public'))
app.use(express.static('views'))
var apiProxy = proxy('/demodate', { target: 'http://localhost:8888',changeOrigin: true });//将服务器代理到localhost:8888端口上
app.use('/demodate/*', apiProxy);
app.listen(8080,function(){
    console.log('8080 connect successfully')
})