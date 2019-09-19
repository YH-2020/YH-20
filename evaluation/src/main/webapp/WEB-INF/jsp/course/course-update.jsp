<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增课程</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<link rel="stylesheet" href="../X-admin/css/font.css">
<link rel="stylesheet" href="../X-admin/css/xadmin.css">
<!-- <link rel="stylesheet" href="./css/theme5.css"> -->
<script src="../X-admin/lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="../X-admin/js/xadmin.js"></script>

</head>
<body>
<div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form">
                <c:forEach items="${list}" var="li">
				<div class="layui-form-item">
					<label for="coursename" class="layui-form-label"> <span class="x-red">*</span>课程名</label>
					<div class="layui-input-inline">					
						<input type="hidden" id="courseid" name="courseid" value="${li.courseid }" 
                          autocomplete="off" class="layui-input">
						<input type="text" id="coursename" name="coursename" autocomplete="off" 
						class="layui-input" value="${li.coursename }" >
					</div>
				</div>
				<div class="layui-form-item">
                     <label for="coursenumber" class="layui-form-label">
                          <span class="x-red">*</span>课程编号</label>
                     <div class="layui-input-inline">
                     <input type="text" id="coursenumber" name="coursenumber"  autocomplete="off"
                      class="layui-input" value="${li.coursenumber }"></div>
                </div>
				<div class="layui-form-item">
					<label for="majorid" class="layui-form-label"> <span
						class="x-red">*</span>专业编号
					</label>
					<div class="layui-input-inline">
						<input type="text" id="majorid" name="majorid" autocomplete="off"
							class="layui-input" value="${li.majorid }">
					</div>
				</div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label"></label>
                        <button class="layui-btn" lay-filter="add" lay-submit="add">修改</button></div>
                </c:forEach>
                </form>
            </div>
        </div>
</body>
<script>
	 layui.use(['form', 'layer'],
            function() {
		 
                $ = layui.jquery;
                var form = layui.form,
              layer = layui.layer; 

              

                //监听提交
                form.on('submit(add)',
                function(data) {
                	//alert(data);
                    // console.log(data);
                    //发异步，把数据提交给php
                   
                   $.ajax({                	  
                    	type:"post",
                    	url:"${pageContext.request.contextPath}/course/updatecourse", 
                    	data:data.field,
                    	success:function(data){
                    		if(data.flag == 1){
                    			layer.alert("修改成功", {
                                    icon: 1
                                }, function() {
                                    //关闭当前frame
                                    xadmin.close();

                                     // 可以对父窗口进行刷新 
                                    xadmin.father_reload(); 
                                });
                    		}else{
                    			layer.alert("增加失败", {
                                    icon: 2
                                }, function() {
                                    //关闭当前frame
                                    xadmin.close();

                                    // 可以对父窗口进行刷新 
                                    xadmin.father_reload();
                                });
                    		}
                    	}
                    })
                    
                    return false;
                });

            });
        </script>
</body>
</html>