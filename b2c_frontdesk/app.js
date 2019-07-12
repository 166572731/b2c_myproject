var express = require('express')
var proxy = require('http-proxy-middleware')
var app  = express()
//��̬��Դֱ�ӷ���
app.use(express.static('public'))
app.use(express.static('views'))
var apiProxy = proxy('/demodate', { target: 'http://localhost:8888',changeOrigin: true });//������������localhost:8888�˿���
app.use('/demodate/*', apiProxy);
app.listen(8080,function(){
    console.log('8080 connect successfully')
})