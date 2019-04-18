<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache"> 
    <meta http-equiv="Cache-Control" content="no-cache"> 
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
    
    <title>Task Manager | Home</title>
    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
     <link href="static/css/style.css" rel="stylesheet">
    
    <!--[if lt IE 9]>
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	<![endif]-->
</head>
<body>

	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Bootsample</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="new-task">New Task</a></li>
					<li><a href="all-tasks">All Tasks</a></li>
					<li><a href="all-loaitaikhoans">All LoaiTaiKhoans</a></li>
					<li><a href="all-binhluans">All BinhLuans</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
		<c:when test="${mode == 'MODE_HOME'}">
			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Welcome to Task Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_TASKS'}">
			<div class="container text-center" id="tasksDiv">
				<h3>My Tasks</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Description</th>
								<th>Date Created</th>
								<th>Finished</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="task" items="${tasks}">
								<tr>
									<td>${task.id}</td>
									<td>${task.name}</td>
									<td>${task.description}</td>
									<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${task.dateCreated}"/></td>
									<td>${task.finished}</td>
									<td><a href="update-task?id=${task.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="delete-task?id=${task.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>							
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_TASKS2'}">
			<div class="container text-center" id="tasksDiv">
				<h3>My Tasks</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>ma loai tai khoan </th>
								<th>loai tai khoan</th>
								<th>muc luong</th>								
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="loaitaikhoan" items="${loaitaikhoans}">
								<tr>
									<td>${loaitaikhoan.maloaitaikhoan}</td>
									<td>${loaitaikhoan.loaitaikhoan}</td>
									<td>${loaitaikhoan.mucluong}</td>									
									<td><a href="update-loaitaikhoan?id=${loaitaikhoan.maloaitaikhoan}"><span class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="delete-loaitaikhoan?id=${loaitaikhoan.maloaitaikhoan}"><span class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_TASKS3'}">
			<div class="container text-center" id="tasksDiv">
				<h3>My Tasks</h3>
				<hr>
				<div class="table-responsive">
				<form class="form-inline pull-right" action="/seach-binhluan" method="GET">
				<div class="form-group">
					<input type="text" class="form-control" name="s"
						placeholder="Type employee name..." />
				</div>
				<button type="submit" class="btn btn-primary">Search</button>
				</form>
				
				
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>ma binh luan</th>
								<th>ma tin tuc </th>
								<th>ten dang nhap</th>	
								<th>noi dung</th>	
								<th>thoi gian dang binh luan</th>								
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="binhluan" items="${binhluans}">
								<tr>
									<td>${binhluan.mabinhluan}</td>
									<td>${binhluan.matintuc}</td>
									<td>${binhluan.tendangnhap}</td>
									<td>${binhluan.noidung}</td>
									<td>${binhluan.thoigiandangbinhluan}</td>	
									<td><a href="seach-binhluan?s=${binhluan.tendangnhap}"><span class="glyphicon glyphicon-pencil"></span></a></td>								
									<td><a href="update-loaitaikhoan?id=${binhluan.mabinhluan}"><span class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="delete-loaitaikhoan?id=${binhluan.mabinhluan}"><span class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_TASKS7'}">
			<div class="container text-center" id="tasksDiv">
				<h3>My Tasks</h3>
				<hr>
				<div class="table-responsive">
				
				 	
				
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>ma binh luan</th>
								<th>ma tin tuc </th>
								<th>ten dang nhap</th>	
								<th>noi dung</th>	
								<th>thoi gian dang binh luan</th>								
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="binhluan" items="${binhluans}">
								<tr>
									<td>${binhluan.mabinhluan}</td>
									<td>${binhluan.matintuc}</td>
									<td>${binhluan.tendangnhap}</td>
									<td>${binhluan.noidung}</td>
									<td>${binhluan.thoigiandangbinhluan}</td>	
									<td><a href="seach-binhluan?tendangnhap="><span class="glyphicon glyphicon-pencil"></span></a></td>								
									<td><a href="update-loaitaikhoan?id=${binhluan.mabinhluan}"><span class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="delete-loaitaikhoan?id=${binhluan.mabinhluan}"><span class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Task</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-task">
					<input type="hidden" name="id" value="${task.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name" value="${task.name}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Description</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="description" value="${task.description}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Finished</label>
						<div class="col-md-7">
							<input type="radio" class="col-sm-1" name="finished" value="true"/>
							<div class="col-sm-1">Yes</div>
							<input type="radio" class="col-sm-1" name="finished" value="false" checked/>
							<div class="col-sm-1">No</div>
						</div>				
					</div>		
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save"/>
					</div>
				</form>
			</div>
		</c:when>		
	</c:choose>

	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>