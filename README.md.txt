# Mục tiêu
Làm quen với Jetpack Compose để xây dựng UI.

Biết cách bố trí layout theo chiều dọc (Column, Box, Row).

Sử dụng các thành phần như: Image, Text, IconButton, Icon, Surface.

Tùy biến giao diện với padding, size, border, font, v.v.

Hiểu cách tạo UI trung tâm và bố trí các nút điều hướng.

# Kết quả đạt được
Một màn hình hiển thị avatar, tên, địa chỉ người dùng.

Hai nút điều hướng ở góc trái và phải trên cùng.

Giao diện đẹp, đơn giản, hiện đại và đúng bố cục mong muốn.

# Giải thích ngắn gọn các hàm
onCreate()	Hàm khởi tạo của MainActivity, gọi setContent() để thiết lập UI bằng Compose.
ProfileScreen()	Hàm @Composable chính để hiển thị toàn bộ giao diện hồ sơ.
Box()	Chứa toàn bộ màn hình, cho phép xếp chồng các thành phần con (như header và content).
Row()	Hiển thị 2 nút (back và menu) trên cùng theo chiều ngang.
IconButton()	Nút chứa biểu tượng (icon), có thể click được.
Icon()	Biểu tượng trong nút (ví dụ: mũi tên quay lại hoặc cây bút).
Column()	Sắp xếp avatar, tên, địa chỉ theo chiều dọc và căn giữa màn hình.
Image()	Hiển thị ảnh avatar.
Text()	Hiển thị tên và địa chỉ người dùng.
