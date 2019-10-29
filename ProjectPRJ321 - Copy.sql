Use master;
GO
if exists (select * from sysdatabases where name='ProjectPRJ321')
		drop database ProjectPRJ321
go

GO
CREATE DATABASE ProjectPRJ321
GO
USE ProjectPRJ321
GO

CREATE TABLE Account (
	UserID int IDENTITY(1,1),
	Name nvarchar(30) ,
	Age int ,
	Phone varchar(15) ,
	Email varchar(30) ,
	Username varchar(40),
	[Password] varchar(40),
	RoleAcc varchar(10),
	Primary KEY(UserID)
)
GO
INSERT INTO Account
VALUES (N'Tuấn Anh',20, '096840000', 'anhnt@fpt.edu.vn','anhnt@fpt.edu.vn','ahihi123','admin'),
	(N'Đình Duy',20, '0962220000', 'duydt@fpt.edu.vn','duydt@fpt.edu.vn','ahihi123','user'),
	(N'Việt Tùng',20, '0968242000', 'tungnv@fpt.edu.vn','tungnv@fpt.edu.vn','ahihi123','user'),
	(N'Bá Dương',20, '096125000', 'duongnb@fpt.edu.vn','duongnb@fpt.edu.vn','ahihi123','admin'),
	(N'Chú heo con',20, '096235000', 'conch@fpt.edu.vn','conch@fpt.edu.vn','ahihi123','user'),
	(N'Chú lợn con',20, '09623600', 'concl@fpt.edu.vn','concl@fpt.edu.vn','ahihi123','user');
GO
CREATE TABLE TypePaper (
	TypeID int IDENTITY(1,1),
	Content nvarchar(30),
	PRIMARY KEY(TypeID)
)
GO
INSERT INTO TypePaper
VALUES (N'Thể thao'),
(N'Thời trang'),
(N'Ẩm thực'),
(N'Thời sự'),
(N'Khác');

GO

CREATE TABLE Paper (
	
	PaperID int IDENTITY(1,1),
	Title nvarchar(200),
	Author nvarchar(30),
	Body text,
	Img nvarchar(50),
	TypeID int,
	[Date] date,
	[Status] bit,
	PRIMARY KEY(PaperID)
)
GO
INSERT INTO Paper
VALUES (N'Ronaldo bị gay',N'Việt Tùng','Tiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodoconsequat.','3.jpg', 1, '2019-03-24',1),
(N'Thảm họa HOLYWOOD',N'Tuấn Anh','smt','3.jpg', 2, '2019-03-24',1),
(N'Đưa món Việt vươn tầm thế giời',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',1),
(N'Sóng thần tại Đà Nẵng',N'Bá Dương','smt','3.jpg', 4, '2019-03-24',1),
(N'Sầu riêng lên mặt trăng',N'Chú heo con','smt','3.jpg', 5, '2019-03-24',1),
(N'Ronaldo lấy chồng',N'Việt Tùng','<p>Tiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea. Liusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, qui s nostrud exercitation ullamLorem ipsum dolor sit amet, consectetur adipisicing elit.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>

                                        <blockquote class="yummy-blockquote mt-30 mb-30">
                                            <h5 class="mb-30">“Technology is nothing. What"s important is that you have a faith in people, that they"re basically good and smart, and if you give them tools, they"ll do wonderful things with them.”</h5>
                                            <h6 class="text-muted">Steven Jobs</h6>
                                        </blockquote>

                                        <h4>You Can Buy For Less Than A College Degree</h4>
                                        <p>Dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. </p>
                                        <h4>You Can Buy For Less Than A College Degree</h4>
                                        <p>Liusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, qui s nostrud exercitation ullamLorem ipsum dolor sit amet, consectetur adipisicing elit.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaLorem ipsum dolor sit amet, consectetur adipisicing elit.</p>

                                        <ul class="mb-30">
                                            <li>1/3 cup Lonsectetur adipisicing elit.Lorem ipsum</li>
                                            <li>1/2 cup Veniam, quis nostrud exercitation</li>
                                            <li>Ut labore et dolore magna</li>
                                            <li>Lonsectetur adipisicing elit.Lorem ipsum</li>
                                            <li>Lonsectetur adipisicing elit.Lorem ipsum</li>
                                            <li>Ut labore et dolore magna</li>
                                            <li>Lonsectetur adipisicing elit.Lorem ipsum</li>
                                        </ul>','3.jpg', 1, '2019-03-24',0),
(N'HOLYWOOD ở đâu',N'Tuấn Anh','smt','3.jpg', 2, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Đưa món Việt - phở bò lên thế giới',N'Đình Duy','smt','duy1.jpg', 3, '2019-03-24',0),
(N'Bão đổ bộ lên miền Bắc',N'Bá Dương','smt','3.jpg', 4, '2019-03-24',0),
(N'Khám phá phi hành đoàn CS1302',N'Chú heo con','smt','3.jpg', 5,'2019-03-24',0);

GO

CREATE TABLE [Like](
	UserID int,
	PaperID int,
	[Date Like] date,
	PRIMARY KEY (UserID,PaperID)
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

GO
CREATE TABLE Comment(
	UserID int,
	PaperID int,
	[Content Comment] ntext,
	
)
GO
INSERT INTO Comment
VALUES (1,1,N'Theo tài liệu điều tra, khoảng 7h30 ngày 5/10, tại vỉa hè trước cửa lớp mầm non tư thục Tuổi Thơ Xanh (thuộc tổ 2, khu 2, phường Yết Kiêu, thành phố Hạ Long), Toàn đã có hành vi chửi bới, tát vào mặt và bắt 3 cô giáo Hà Thị H.,  Ngô Vân K., Đặng Thị L. phải quỳ gối xin lỗi vì cho rằng các cô đã bạo hành con gái mình.'),
(2,2,N'Sau khi nhận được tin báo và tiến hành xác minh, cơ quan Cảnh sát điều tra Công an thành phố Hạ Long (Quảng Ninh) đã ra quyết định khởi tố vụ án, khởi tố bị can đối với Đỗ Thanh Toàn (SN 1992, trú phường Cao Xanh, TP Hạ Long) về hành vi làm nhục người khác.'),
(3,3,N'Phòng GD&ĐT TP Hạ Long ngay sau khi biết thông tin xảy ra cũng đã báo cáo sự việc lên cấp trên và yêu cầu xử lý nghiêm người có hành vi làm nhục giáo viên này. Đại diện phòng cũng xuống thăm hỏi, động viên các cô giáo bị hành hung. Các cô giáo ổn định tinh thần và dạy học bình thường.');
GO
ALTER TABLE Paper ADD CONSTRAINT [FK.paper.typeid] FOREIGN KEY (TypeID) REFERENCES TypePaper(TypeID);
GO
ALTER TABLE [Like] ADD CONSTRAINT [FK.like.userid] FOREIGN KEY (UserID) REFERENCES Account(UserID);
GO
ALTER TABLE [Like] ADD CONSTRAINT [FK.like.paperid] FOREIGN KEY (PaperID) REFERENCES Paper(PaperID);
GO
ALTER TABLE [Comment] ADD CONSTRAINT [FK.comment.userid] FOREIGN KEY (UserID) REFERENCES Account(UserID);
GO
ALTER TABLE [Comment] ADD CONSTRAINT [FK.comment.paperid] FOREIGN KEY (PaperID) REFERENCES Paper(PaperID);
GO



INSERT INTO [Account] (Name, Email, Username,Password,RoleAcc)
  VALUES ('bang','bangpc@fpt.edu.vn','bangpc@fpt.edu.vn','ahihi123','user')