<%@ page import ="java.time.LocalDate" %>
<html>
<head>
		<title>${apptitle}</title>
		<link rel="stylesheet" href="assets/site.css"/>
	</head>
	<body>
			<header class="page-header">
			 	<h3 style="text-align: right">
			 		<%= LocalDate.now() %>
			 	</h3>
			 	<h1 style="border-bottom: 1px solid black">My first Spring web MVC application</h1>
			</header>
			
			<nav>
			  	<a href ="home">Home</a>
			  	<a href="greet">Greet</a>
			  	<a href="emp">Employee Data</a>
			  	<a href="tasks">Task</a>
			</nav>