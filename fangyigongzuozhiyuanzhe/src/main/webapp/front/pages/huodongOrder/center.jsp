<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!-- 个人中心 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>个人中心</title>
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<style>

        .header {animation-name: fadeInUp; padding-bottom: 26px;padding-top: 70px;position:relative;border-bottom:1px solid rgba(0,0,0,0.1);margin-bottom:40px;}
		#plheader{ top: 48px;padding-bottom: 40px;width: 220px;position: relative;height: 70px;border-radius: 3px 3px 0px 0px;padding-top: 40px !important;}
		.header p.title {color: #fff;font-size: 25px;margin-bottom: 8px;text-align: left;white-space: nowrap;overflow: hidden;margin-left: 31px;font-weight: bold; padding-bottom: 8px;margin-top: 0px;width: 158px;border-bottom: 1px solid rgba(255, 255, 255, 0.16);letter-spacing:1px;}
		#category {padding-top: 136px;margin-left: 0px;padding-bottom: 30px;width: 205px;float: left;padding-left: 15px;text-align: left;margin-top: -120px;background-color: var(--publicMainColor);border-radius: 0px 0px 3px 3px;}
		.header p.subtitle {font-family:HELVETICANEUELTPRO-THEX, "微软雅黑";letter-spacing: 1px;font-size: 15px;display: inline-block;padding-top: 0px;color: #ffffff; margin-top: 0px; margin-right:31px;float: right;overflow: hidden;width: 156px;text-align: left;}
		#category a.active::before {display: none;}
		#category a.active::after {display:none;}
		#category a.active, #category a:hover {background: var(--publicSubColor);color: #FFFFFF;border-color: #838383;transition: 0.3s; transform-origin: bottom;}
		#category li {height:auto;position:relative;float:none; display:block;margin-top:1px;margin-bottom:1px;line-height:43px;border-bottom: 1px solid rgba(255, 255, 255, 0.05);padding-left: 15px;margin-right:16px;transition: all 0.6s cubic-bezier(0.215, 0.61, 0.355, 1) 0s;}
		#category li:last-child { border-bottom:none;}
		#category a { border:0px; background:none; color:#CFDCF9; font-size:14px; position:relative; padding:0;line-height: 42px;height: 42px;}
		#category a::before { content:''; position:absolute; content: '';position: absolute;width: 190px;background-color: #AEAEAF;height: 42px;background: transparent;left: -16px;position: absolute;transition: all 0.6s cubic-bezier(0.215, 0.61, 0.355, 1) 0s; }
		#category a.active::before {display: none;}
		#category li:hover {padding-left:30px;background-color: var(--publicSubColor);transition: all 0.6s cubic-bezier(0.215, 0.61, 0.355, 1) 0s;}
		#category .bbbb, #category li .aaaa {padding-left:30px;background-color: var(--publicSubColor);transition: all 0.6s cubic-bezier(0.215, 0.61, 0.355, 1) 0s;background: var(--publicSubColor);color: #FFFFFF;  transition: 0.3s; transform-origin: bottom;}
		#category li:hover ul li{width: 136px;}
		#category li:hover ul li a{color: rgba(255, 255, 255, 0.45);width: 136px;overflow: hidden;    background-color: rgb(34, 73, 160);    padding-left:0px;}
		#category li ul li:hover a{  padding-left:0px; margin-left: 0px;}
		#category li:hover a{color:#fff}
	</style>
	<body style="background: #EEEEEE;">

		<div id="app">
			<!-- 轮播图 -->
			<div class="layui-carousel" id="swiper">
				<div carousel-item id="swiper-item">
					<div v-for="(item,index) in swiperList" v-bind:key="index">
						<img class="swiper-item" :src="item.img">
					</div>
				</div>
			</div>
			<!-- 轮播图 -->
.

			<div class="center-container">
				<!-- 个人中心菜单 config.js-->
<div style=" width:auto; margin:-47px 10px 0px auto">
    <div class="header" id="plheader">
        <p class="title">个人中心</p>
        <p class="subtitle">USER / CENTER</p>
    </div>
    <ul id="category">
        <li v-for="(item,index) in centerMenu" v-bind:key="index" :class="index==0?'bbbb':''">
            <a :href="'javascript:jump(\''+item.url+'\')'" style="color:#FFFFFF;" :class="index==0?'aaaa':''">{{item.name}}</a>
        </li>
    </ul>
</div>
				<!-- 个人中心菜单 -->
				<!-- 个人中心 -->
				<div class="right-container">
					<form class="layui-form" lay-filter="myForm">
						<!-- 主键 -->
						<input type="hidden" name="id" id="id" />

						<div class="layui-form-item">
							<label class="layui-form-label">报名编号</label>
							<div class="layui-input-block">
								<input type="text" style="width: 500px" name="huodongOrderUuidNumber" id="huodongOrderUuidNumber" lay-verify="required" placeholder="报名编号" autocomplete="off" class="layui-input">
							</div>
						</div>

						<div class="layui-form-item">
							<div class="layui-input-block">
								<img id="huodongOrderJiankangmaPhotoImg"
									 style="width: 100px;height: 100px;border-radius: 50%;border: 2px solid #EEEEEE;"
									 src="../../img/avator.png">
								<input type="hidden" id="huodongOrderJiankangmaPhoto" name="huodongOrderJiankangmaPhoto"/>
							</div>
						</div>

						<div class="layui-form-item">
							<div class="layui-input-block">
								<button type="button" class="layui-btn btn-theme" id="huodongOrderJiankangmaPhotoUpload">
									<i class="layui-icon">&#xe67c;</i>上传图片
								</button>
							</div>
						</div>

						<div class="layui-form-item">
							<div class="layui-input-block">
								<img id="huodongOrderXingchengmaPhotoImg"
									 style="width: 100px;height: 100px;border-radius: 50%;border: 2px solid #EEEEEE;"
									 src="../../img/avator.png">
								<input type="hidden" id="huodongOrderXingchengmaPhoto" name="huodongOrderXingchengmaPhoto"/>
							</div>
						</div>

						<div class="layui-form-item">
							<div class="layui-input-block">
								<button type="button" class="layui-btn btn-theme" id="huodongOrderXingchengmaPhotoUpload">
									<i class="layui-icon">&#xe67c;</i>上传图片
								</button>
							</div>
						</div>

						<div class="layui-form-item">
							<div class="layui-input-block">
								<img id="huodongOrderHesuanbaogaoPhotoImg"
									 style="width: 100px;height: 100px;border-radius: 50%;border: 2px solid #EEEEEE;"
									 src="../../img/avator.png">
								<input type="hidden" id="huodongOrderHesuanbaogaoPhoto" name="huodongOrderHesuanbaogaoPhoto"/>
							</div>
						</div>

						<div class="layui-form-item">
							<div class="layui-input-block">
								<button type="button" class="layui-btn btn-theme" id="huodongOrderHesuanbaogaoPhotoUpload">
									<i class="layui-icon">&#xe67c;</i>上传图片
								</button>
							</div>
						</div>

						<div class="layui-form-item">
							<label class="layui-form-label">个人介绍</label>
							<div class="layui-input-block">
								<input type="text" style="width: 500px" name="huodongOrderJieshaoText" id="huodongOrderJieshaoText" lay-verify="required" placeholder="个人介绍" autocomplete="off" class="layui-input">
							</div>
						</div>

						<div class="layui-form-item">
							<label class="layui-form-label">报名状态</label>
							<div  class="layui-input-inline" style="width: 500px">
								<select name="huodongOrderTypes" id="huodongOrderTypes">
                                    <option v-for="item in huodongOrderTypesList" :value="item.codeIndex" :key="item.codeIndex">{{ item.indexName }}</option>
								</select>
							</div>
						</div>

						<div class="layui-form-item">
							<label class="layui-form-label">审核状态</label>
							<div  class="layui-input-inline" style="width: 500px">
								<select name="huodongOrderYesnoTypes" id="huodongOrderYesnoTypes">
                                    <option v-for="item in huodongOrderYesnoTypesList" :value="item.codeIndex" :key="item.codeIndex">{{ item.indexName }}</option>
								</select>
							</div>
						</div>

						<div class="layui-form-item">
							<label class="layui-form-label">审核意见</label>
							<div class="layui-input-block">
								<input type="text" style="width: 500px" name="huodongOrderYesnoText" id="huodongOrderYesnoText" lay-verify="required" placeholder="审核意见" autocomplete="off" class="layui-input">
							</div>
						</div>

						<div class="layui-form-item">
							<label class="layui-form-label">审核时间</label>
							<div class="layui-input-block">
								<input type="text" style="width: 500px" name="huodongOrderShenheTime" id="huodongOrderShenheTime"  lay-verify="required|date"   placeholder="审核时间" autocomplete="off" class="layui-input">
							</div>
						</div>

						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn btn-submit btn-theme" lay-submit lay-filter="thisSubmit">更新信息</button>
							</div>
						</div>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button @click="logout" class="layui-btn btn-submit">退出登录</button>
							</div>
						</div>
					</form>
				</div>
				<!-- 个人中心 -->
			</div>

		</div>

		<!-- layui -->
		<script src="../../layui/layui.js"></script>
		<!-- vue -->
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>
		<!-- 校验格式工具类 -->
		<script src="../../js/validate.js"></script>

		<script>
            var vue = new Vue({
                el: '#app',
                data: {
                    // 轮播图
                    swiperList: [{
                        img: '../../img/banner.jpg'
                    }],
					huodongOrderTypesList: [],
					huodongOrderYesnoTypesList: [],
                    centerMenu: centerMenu
                },
                updated: function () {
                    layui.form.render(null, 'myForm');
                },
                methods: {
                    jump(url) {
                        jump(url)
                    },
                    logout() {
                        localStorage.removeItem('Token');
                        localStorage.removeItem('role');
                        localStorage.removeItem('sessionTable');
                        localStorage.removeItem('adminName');
                        localStorage.removeItem('userid');
                        localStorage.removeItem('userTable');
                        window.parent.location.href = '../login/login.jsp';
                    }
                }
            });

            layui.use(['layer', 'element', 'carousel', 'http', 'jquery', 'form', 'upload', 'laydate'], function () {
                var layer = layui.layer;
                var element = layui.element;
                var carousel = layui.carousel;
                var http = layui.http;
                var jquery = layui.jquery;
                var form = layui.form;
                var upload = layui.upload;
                var laydate = layui.laydate;

                // 充值
                jquery('#btn-recharge').click(function (e) {
                    layer.open({
                        type: 2,
                        title: '用户充值',
                        area: ['900px', '600px'],
                        content: '../recharge/recharge.jsp'
                    });
                });


                // 获取轮播图 数据(有问题把下面的打开 把这个注视掉)
                http.request('config/list', 'get', {
                    page: 1,
                    limit: 5
                }, function(res) {
                    if (res.data.list.length > 0) {
                        let swiperList = [];
                        res.data.list.forEach(element => {
                            if (element.value != null) {
                            swiperList.push({
                                img: element.value
                            });
                        }
                    });
                        vue.swiperList = swiperList;
                        // 轮播图
                        vue.$nextTick(() => {
                            carousel.render({
                            elem: '#swiper',
                            width: '100%',
                            height: '450px',
                            arrow: 'hover',
                            anim: 'default',
                            autoplay: 'true',
                            interval: '3000',
                            indicator: 'inside'
                        });

                    })
                    }
                });

                /*// 获取轮播图 数据
                http.request('config/list', 'get', {
                    page: 1,
                    limit: 5
                }, function(res) {
                    if (res.data.list.length > 0) {
                        var swiperItemHtml = '';
                        for (let item of res.data.list) {
                            if (item.value != "" && item.value != null) {
                                swiperItemHtml +=
                                        '<div>' +
                                        '<img class="swiper-item" src="' + item.value + '">' +
                                        '</div>';
                            }
                        }
                        jquery('#swiper-item').html(swiperItemHtml);
                        // 轮播图
                        carousel.render({
                            elem: '#swiper',
                            width: swiper.width,height:swiper.height,
                            arrow: swiper.arrow,
                            anim: swiper.anim,
                            interval: swiper.interval,
                            indicator: "none"
                        });
                    }
                });*/


                // 查询字典表相关
            		// 报名状态的查询和初始化
           		huodongOrderTypesSelect();
            		// 审核状态的查询和初始化
           		huodongOrderYesnoTypesSelect();
                // 日期效验规则及格式
                dateTimePick();
                // 表单效验规则
                form.verify({
                    // 正整数效验规则
                    integer: [
                        /^[1-9][0-9]*$/
                        ,'必须是正整数'
                    ]
                    // 小数效验规则
                    ,double: [
                        /^[1-9][0-9]{0,5}(\.[0-9]{1,2})?$/
                        ,'最大整数位为6为,小数最大两位'
                    ]
                });

                // 上传文件
            	// 健康码的文件上传
                upload.render({
                    //绑定元素
                    elem: '#huodongOrderJiankangmaPhotoUpload',
                    //上传接口
                    url: http.baseurl + 'file/upload',
                    // 请求头
                    headers: {
                        Token: localStorage.getItem('Token')
                    },
                    // 允许上传时校验的文件类型
                    accept: 'images',
                    before: function () {
                        //loading层
                        var index = layer.load(1, {
                            shade: [0.1, '#fff'] //0.1透明度的白色背景
                        });
                    },
                    // 上传成功
                    done: function (res) {
                        console.log(res);
                        layer.closeAll();
                        if (res.code == 0) {
                            layer.msg("上传成功", {
                                time: 2000,
                                icon: 6
                            })
                            var url = http.baseurl + 'upload/' + res.file;
                            jquery('#huodongOrderJiankangmaPhoto').val(url);
                            jquery('#huodongOrderJiankangmaPhotoImg').attr('src', url);
                        } else {
                            layer.msg(res.msg, {
                                time: 2000,
                                icon: 5
                            })
                        }
                    },
                    //请求异常回调
                    error: function () {
                        layer.closeAll();
                        layer.msg("请求接口异常", {
                            time: 2000,
                            icon: 5
                        })
                    }
                });
            	// 行程码的文件上传
                upload.render({
                    //绑定元素
                    elem: '#huodongOrderXingchengmaPhotoUpload',
                    //上传接口
                    url: http.baseurl + 'file/upload',
                    // 请求头
                    headers: {
                        Token: localStorage.getItem('Token')
                    },
                    // 允许上传时校验的文件类型
                    accept: 'images',
                    before: function () {
                        //loading层
                        var index = layer.load(1, {
                            shade: [0.1, '#fff'] //0.1透明度的白色背景
                        });
                    },
                    // 上传成功
                    done: function (res) {
                        console.log(res);
                        layer.closeAll();
                        if (res.code == 0) {
                            layer.msg("上传成功", {
                                time: 2000,
                                icon: 6
                            })
                            var url = http.baseurl + 'upload/' + res.file;
                            jquery('#huodongOrderXingchengmaPhoto').val(url);
                            jquery('#huodongOrderXingchengmaPhotoImg').attr('src', url);
                        } else {
                            layer.msg(res.msg, {
                                time: 2000,
                                icon: 5
                            })
                        }
                    },
                    //请求异常回调
                    error: function () {
                        layer.closeAll();
                        layer.msg("请求接口异常", {
                            time: 2000,
                            icon: 5
                        })
                    }
                });
            	// 核算检测报告的文件上传
                upload.render({
                    //绑定元素
                    elem: '#huodongOrderHesuanbaogaoPhotoUpload',
                    //上传接口
                    url: http.baseurl + 'file/upload',
                    // 请求头
                    headers: {
                        Token: localStorage.getItem('Token')
                    },
                    // 允许上传时校验的文件类型
                    accept: 'images',
                    before: function () {
                        //loading层
                        var index = layer.load(1, {
                            shade: [0.1, '#fff'] //0.1透明度的白色背景
                        });
                    },
                    // 上传成功
                    done: function (res) {
                        console.log(res);
                        layer.closeAll();
                        if (res.code == 0) {
                            layer.msg("上传成功", {
                                time: 2000,
                                icon: 6
                            })
                            var url = http.baseurl + 'upload/' + res.file;
                            jquery('#huodongOrderHesuanbaogaoPhoto').val(url);
                            jquery('#huodongOrderHesuanbaogaoPhotoImg').attr('src', url);
                        } else {
                            layer.msg(res.msg, {
                                time: 2000,
                                icon: 5
                            })
                        }
                    },
                    //请求异常回调
                    error: function () {
                        layer.closeAll();
                        layer.msg("请求接口异常", {
                            time: 2000,
                            icon: 5
                        })
                    }
                });

                // 查询用户信息
                let table = localStorage.getItem("userTable");

                if (!table) {
                    layer.msg('请先登录', {
                        time: 2000,
                        icon: 5
                    }, function () {
                        window.parent.location.href = '../login/login.jsp';
                    });
                }


                http.request(`huodongOrder/session`, 'get', {}, function (data) {
                    // 表单赋值
                    form.val("myForm", data.data);
					jquery("#huodongOrderJiankangmaPhotoImg").attr("src", data.data.huodongOrderJiankangmaPhoto);
					jquery("#huodongOrderXingchengmaPhotoImg").attr("src", data.data.huodongOrderXingchengmaPhoto);
					jquery("#huodongOrderHesuanbaogaoPhotoImg").attr("src", data.data.huodongOrderHesuanbaogaoPhoto);
                });

                // 提交表单
                form.on('submit(thisSubmit)', function (data) {
                    data = data.field;
                    http.requestJson(table + '/update', 'post', data, function (res) {
                        layer.msg('修改成功', {
                            time: 2000,
                            icon: 6
                        }, function () {
                            window.location.reload();
                        });
                    });
                    return false
                });


				// 日期框初始化
                function dateTimePick(){
					// 审核时间的时间初始化
					laydate.render({
						elem: '#huodongOrderShenheTime'
						,type: 'datetime'
					});
                }



				//报名状态的查询
			   function huodongOrderTypesSelect() {
				   //填充下拉框选项
				   http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=huodong_order_types", "GET", {}, (res) => {
					   if(res.code == 0){
						   vue.huodongOrderTypesList = res.data.list;
					   }
				   });
			   }

				//审核状态的查询
			   function huodongOrderYesnoTypesSelect() {
				   //填充下拉框选项
				   http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=huodong_order_yesno_types", "GET", {}, (res) => {
					   if(res.code == 0){
						   vue.huodongOrderYesnoTypesList = res.data.list;
					   }
				   });
			   }


            });
		</script>
	</body>
</html>
