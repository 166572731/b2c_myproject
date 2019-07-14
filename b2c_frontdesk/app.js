var express = require('express')
var proxy = require('http-proxy-middleware')
var app  = express()
//静态资源直接访问
app.use(express.static('public'))
app.use(express.static('views'))

/*陈磊*/
var apiProxy1 = proxy('/chen', { target: 'http://localhost:8888',changeOrigin: true });//将服务器代理到localhost:8888端口上
app.use('/chen/*', apiProxy1);

/*喻俊*/
var apiProxy2 = proxy('/yujun', { target: 'http://localhost:9999',changeOrigin: true });
app.use('/yujun/*', apiProxy2);

/*甘家辉*/
var apiProxy3 = proxy('/gan', { target: 'http://localhost:7777',changeOrigin: true });
app.use('/gan/*', apiProxy3);

/*彭文浩*/
var apiProxy4 = proxy('/peng', { target: 'http://localhost:6666',changeOrigin: true });
app.use('/peng/*', apiProxy4);

/*肖新雨*/
var apiProxy5 = proxy('/xiao', { target: 'http://localhost:5555',changeOrigin: true });
app.use('/xiao/*', apiProxy5);

app.listen(8080,function(){
    console.log('8080 connect successfully')
})