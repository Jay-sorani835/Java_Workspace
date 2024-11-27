<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>OTP Verification</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .otp-container {
            background-color: #fff;
            padding: 20px 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }

        .otp-container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .otp-input-container {
            display: flex;
            justify-content: space-between;
            margin-bottom: 20px;
        }

        .otp-input-container input[type="text"] {
            width: 50px;
            height: 50px;
            font-size: 24px;
            text-align: center;
            border: 2px solid #ccc;
            border-radius: 5px;
            transition: border-color 0.3s;
        }

        .otp-input-container input[type="text"]:focus {
            border-color: #007bff;
            outline: none;
        }

        .otp-input-container input[type="text"]::-webkit-outer-spin-button,
        .otp-input-container input[type="text"]::-webkit-inner-spin-button {
            -webkit-appearance: none;
            margin: 0;
        }

        .otp-input-container input[type="text"][type="number"] {
            -moz-appearance: textfield;
        }

        .otp-submit-btn {
            width: 100%;
            padding: 10px 0;
            background-color: #007bff;
            border: none;
            border-radius: 5px;
            color: white;
            font-size: 18px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .otp-submit-btn:hover {
            background-color: #0056b3;
        }

        .resend-otp {
            text-align: center;
            margin-top: 10px;
            font-size: 14px;
        }

        .resend-otp a {
            color: #007bff;
            text-decoration: none;
            transition: color 0.3s;
        }

        .resend-otp a:hover {
            color: #0056b3;
        }
    </style>
</head>
<body>

<div class="otp-container">
    <h2>Verify OTP</h2>
    <form action="otpcheck.jsp" method="POST">
        <div class="otp-input-container">
            <input type="text" name="otp1" maxlength="1" required>
            <input type="text" name="otp2" maxlength="1" required>
            <input type="text" name="otp3" maxlength="1" required>
            <input type="text" name="otp4" maxlength="1" required>
        </div>
        <button type="submit" class="otp-submit-btn">Verify</button>
    </form>
</div>

</body>
</html>
