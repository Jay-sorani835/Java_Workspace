<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WhatsApp Chat List</title>
<style>
body {
  background-color: #202020;
  color: #ffffff;
  font-family: sans-serif;
}

.container {
  display: flex;
  height: 100vh;
}

.sidebar {
  width: 100px;
  background-color: #121212;
  padding: 20px;
}

.chat-list {
  width: calc(100% - 100px);
  padding: 20px;
}

.chat-item {
  display: flex;
  align-items: center;
  padding: 10px;
  border-bottom: 1px solid #303030;
}

.avatar {
  width: 40px;
  height: 40px;
  border-radius: 50%;
  margin-right: 10px;
}

.chat-info {
  flex-grow: 1;
}

.chat-info h3 {
  margin: 0;
  font-size: 16px;
}

.chat-info p {
  margin: 0;
  font-size: 12px;
  color: #808080;
}

.chat-time {
  font-size: 12px;
  color: #808080;
}

.whatsapp-logo {
  display: block;
  width: 50px;
  height: 50px;
  margin: 20px auto;
}

.footer {
  text-align: center;
  margin-top: 20px;
}
</style>
</head>
<body>
  <div class="container">
    <div class="sidebar">
      <img src="whatsapp-logo.png" alt="WhatsApp Logo" class="whatsapp-logo">
      <ul>
        <li class="chat-item">
          <img src="avatar.png" alt="Avatar" class="avatar">
          <div class="chat-info">
            <h3>4 Idiots</h3>
            <p>Suketu: Aur kon hai ye sab log?</p>
          </div>
          <div class="chat-time">17:08</div>
        </li>
        <li class="chat-item">
          <img src="avatar.png" alt="Avatar" class="avatar">
          <div class="chat-info">
            <h3>Internship | Job Updates (Daily)</h3>
            <p>Mihir Sarvaiya added you</p>
          </div>
          <div class="chat-time">16:53</div>
        </li>
        <li class="chat-item">
          <img src="avatar.png" alt="Avatar" class="avatar">
          <div class="chat-info">
            <h3>VVP IT 2022 (B) STUDENTS</h3>
            <p>~DAK: Dear students Hope all of you a...</p>
          </div>
          <div class="chat-time">14:01</div>
        </li>
        <li class="chat-item">
          <img src="avatar.png" alt="Avatar" class="avatar">
          <div class="chat-info">
            <h3>Avadh Rangani</h3>
            <p>✓✓ Image</p>
          </div>
          <div class="chat-time">Yesterday</div>
        </li>
        <li class="chat-item">
          <img src="avatar.png" alt="Avatar" class="avatar">
          <div class="chat-info">
            <h3>Bhayji</h3>
            <p>Missed video call</p>
          </div>
          <div class="chat-time">Yesterday</div>
        </li>
        <li class="chat-item">
          <img src="avatar.png" alt="Avatar" class="avatar">
          <div class="chat-info">
            <h3>vvp unions</h3>
            <p>~])#@[\]€$#: Hello Tech Enthusiast...</p>
          </div>
          <div class="chat-time">Yesterday</div>
        </li>
        <li class="chat-item">
          <img src="avatar.png" alt="Avatar" class="avatar">
          <div class="chat-info">
            <h3>Suketu Rola</h3>
          </div>
          <div class="chat-time">Yesterday</div>
        </li>
      </ul>
    </div>
    <div class="chat-list">
      <p>WhatsApp for Windows</p>
      <p>Send and receive messages without keeping your phone online.</p>
      <p>Use WhatsApp on up to 4 linked devices and 1 phone at the same time.</p>
      <div class="footer">
        <p>End-to-end encrypted</p>
      </div>
    </div>
  </div>
</body>
</html>