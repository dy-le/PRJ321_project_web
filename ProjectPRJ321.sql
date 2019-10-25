
CREATE DATABASE ProjectPRJ321
GO
USE ProjectPRJ321
GO

CREATE TABLE Account (
	UserID int PRIMARY KEY,
	Name nvarchar(30) ,
	Age int ,
	Phone varchar(15) ,
	Email varchar(30),
	Username varchar(40),
	[Password] varchar(40),
	RoleAcc varchar(10)
)
GO
INSERT INTO Account
VALUES (1,N'Tuấn Anh',20, '096840000', 'anhnt@fpt.edu.vn','anhnt@fpt.edu.vn','ahihi123','admin'),
	(2,N'Đình Duy',20, '0962220000', 'duydt@fpt.edu.vn','duydt@fpt.edu.vn','ahihi123','user'),
	(3,N'Việt Tùng',20, '0968242000', 'tungnv@fpt.edu.vn','tungnv@fpt.edu.vn','ahihi123','user'),
	(4,N'Bá Dương',20, '096125000', 'duongnb@fpt.edu.vn','duongnb@fpt.edu.vn','ahihi123','admin'),
	(5,N'Chú heo con',20, '096235000', 'conch@fpt.edu.vn','conch@fpt.edu.vn','ahihi123','user'),
	(6,N'Chú lợn con',20, '09623600', 'concl@fpt.edu.vn','concl@fpt.edu.vn','ahihi123','user');

GO
CREATE TABLE TypePaper (
	TypeID int PRIMARY KEY,
	Content nvarchar(30),
)
GO
INSERT INTO TypePaper
VALUES (1,N'Thể thao'),
(2,N'Thời trang'),
(3,N'Ẩm thực'),
(4,N'Thời sự'),
(5,N'Khác');
GO

CREATE TABLE Paper (
	
	PaperID int PRIMARY KEY,
	Title nvarchar(200),
	Author nvarchar(30),
	TypeID int,
	[Date] date,
	Status bit,
	FOREIGN KEY (TypeID) REFERENCES TypePaper(TypeID)
)
GO
INSERT INTO Paper
VALUES (1,N'Ronaldo bị gay',N'Việt Tùng', 1, '2019-03-24',1),
(2,N'Thảm họa HOLYWOOD',N'Tuấn Anh', 2, '2019-03-24',1),
(3,N'Đưa món Việt vươn tầm thế giời',N'Đình Duy', 3, '2019-03-24',1),
(4,N'Sóng thần tại Đà Nẵng',N'Bá Dương', 4, '2019-03-24',1),
(5,N'Sầu riêng lên mặt trăng',N'Chú heo con', 5, '2019-03-24',1),
(6,N'Ronaldo lấy chồng',N'Việt Tùng', 1, '2019-03-24',0),
(7,N'HOLYWOOD ở đâu',N'Tuấn Anh', 2, '2019-03-24',0),
(8,N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy', 3, '2019-03-24',0),
(9,N'Bão đổ bộ lên miền Bắc',N'Bá Dương', 4, '2019-03-24',0),
(10,N'Khám phá phi hành đoàn CS1302',N'Chú heo con', 5,'2019-03-24',0);

GO


CREATE TABLE [Like](
	UserID int,
	PaperID int,
	[Date Like] date,
	FOREIGN KEY (UserID) REFERENCES Account(UserID),
	FOREIGN KEY (PaperID) REFERENCES Paper(PaperID)
)
GO
INSERT INTO [Like]
VALUES (1,1,'2019-03-24'),
(2,1,'2019-03-24'),
(3,1,'2019-03-24'),
(4,1,'2019-03-24'),
(5,1,'2019-03-24'),
(6,1,'2019-03-24'),
(1,2,'2019-03-24'),
(2,4,'2019-03-24'),
(3,5,'2019-03-24'),
(4,3,'2019-03-24'),
(5,2,'2019-03-24'),
(6,3,'2019-03-24');
GO
CREATE TABLE Comment(
	UserID int,
	PaperID int,
	[Content Comment] ntext,
	FOREIGN KEY (UserID) REFERENCES Account(UserID),
	FOREIGN KEY (PaperID) REFERENCES Paper(PaperID)
)
GO
INSERT INTO Comment
VALUES (1,1,N'Theo tài liệu điều tra, khoảng 7h30 ngày 5/10, tại vỉa hè trước cửa lớp mầm non tư thục Tuổi Thơ Xanh (thuộc tổ 2, khu 2, phường Yết Kiêu, thành phố Hạ Long), Toàn đã có hành vi chửi bới, tát vào mặt và bắt 3 cô giáo Hà Thị H.,  Ngô Vân K., Đặng Thị L. phải quỳ gối xin lỗi vì cho rằng các cô đã bạo hành con gái mình.'),
(2,2,N'Sau khi nhận được tin báo và tiến hành xác minh, cơ quan Cảnh sát điều tra Công an thành phố Hạ Long (Quảng Ninh) đã ra quyết định khởi tố vụ án, khởi tố bị can đối với Đỗ Thanh Toàn (SN 1992, trú phường Cao Xanh, TP Hạ Long) về hành vi làm nhục người khác.'),
(3,3,N'Phòng GD&ĐT TP Hạ Long ngay sau khi biết thông tin xảy ra cũng đã báo cáo sự việc lên cấp trên và yêu cầu xử lý nghiêm người có hành vi làm nhục giáo viên này. Đại diện phòng cũng xuống thăm hỏi, động viên các cô giáo bị hành hung. Các cô giáo ổn định tinh thần và dạy học bình thường.');
GO

