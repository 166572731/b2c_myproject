var express = require('express')
var proxy = require('http-proxy-middleware')
var app  = express()
//��̬��Դֱ�ӷ���
app.use(express.static('public'))
app.use(express.static('views'))

/*����*/
var apiProxy1 = proxy('/chen', { target: 'http://localhost:8888',changeOrigin: true });//������������localhost:8888�˿���
app.use('/chen/*', apiProxy1);

/*����*/
var apiProxy2 = proxy('/yujun', { target: 'http://localhost:9999',changeOrigin: true });
app.use('/yujun/*', apiProxy2);

/*�ʼһ�*/
var apiProxy3 = proxy('/gan', { target: 'http://localhost:7777',changeOrigin: true });
app.use('/gan/*', apiProxy3);

/*���ĺ�*/
var apiProxy4 = proxy('/peng', { target: 'http://localhost:6666',changeOrigin: true });
app.use('/peng/*', apiProxy4);

/*Ф����*/
var apiProxy5 = proxy('/xiao', { target: 'http://localhost:5555',changeOrigin: true });
app.use('/xiao/*', apiProxy5);

app.listen(8080,function(){
    console.log('8080 connect successfully')
})