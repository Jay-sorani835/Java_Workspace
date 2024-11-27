<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Image</title>
<style type="text/css">
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

body {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  background-color: #fafafa;
  font-family: Arial, sans-serif;
}

.container {
  width: 100%;
  max-width: 400px;
  background-color: #fff;
  padding: 20px;
  border: 1px solid #dbdbdb;
  border-radius: 10px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  text-align: center;
}

h1 {
  font-size: 24px;
  color: #333;
  margin-bottom: 20px;
}

.upload-label {
  display: inline-block;
  background-color: #3897f0;
  color: #fff;
  padding: 10px 20px;
  border-radius: 5px;
  cursor: pointer;
  font-weight: bold;
}

.upload-label input {
  display: none;
}

.image-preview {
  margin-top: 20px;
  width: 100%;
  height: 300px;
  border: 1px solid #dbdbdb;
  border-radius: 10px;
  overflow: hidden;
  display: flex;
  align-items: center;
  justify-content: center;
}

.image-preview img {
  display: none;
  width: 100%;
  height: 100%;
  object-fit: cover;
}

button {
  margin-top: 20px;
  padding: 10px 20px;
  background-color: #3897f0;
  color: #fff;
  border: none;
  border-radius: 5px;
  font-size: 16px;
  cursor: pointer;
}

button:hover {
  background-color: #3579e8;
}

</style>
</head>
<body>
<% response.setHeader("Cache-Control", "no-cache"); 
response.setHeader("cache-control", "no-store");
response.setHeader("pragma", "no-cache");
response.setDateHeader("Expires", 0);
if(!session.getAttribute("insta").equals(null))
{
%>
<div class="container">
    <h1>Upload Image</h1>
    <form id="uploadForm" method="post" action="uploadServlet" enctype="multipart/form-data" class="requires-validation" novalidate>
      <label for="imageUpload" class="upload-label">
      <p>Image size should be less than 1 MB</p>
      <input type="hidden" name="email" value="<%=session.getAttribute("email").toString() %>">
        <span>Choose an image</span>
        <input type="file" id="imageUpload" name="image" accept="image/*" onchange="previewImage(event)" onclick="find()">
      </label>
      <input type="hidden" id="date" name="time" value="">
      <div class="image-preview" id="imagePreview">
        <img id="previewImg" src="" alt="Image Preview">
      </div>
      <button type="submit">Post</button>
    </form>
  </div>

  <script>
    function previewImage(event) {
      const preview = document.getElementById('previewImg');
      preview.src = URL.createObjectURL(event.target.files[0]);
      preview.style.display = 'block';
    }
    function find() {
        let d = new Date;
        document.getElementById("date").value = d.toLocaleString();
    }
  </script>
<% 
}
else
{
	response.sendRedirect("signin.jsp");
}
%>

  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>