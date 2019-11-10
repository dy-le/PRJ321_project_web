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
VALUES ('News'),
('Fashion'),
('Food'),
('Sport'),
('Others');

GO

CREATE TABLE Paper (
	
	PaperID int IDENTITY(1,1),
	Title nvarchar(200),
	Author nvarchar(30),
	Body ntext,
	Img nvarchar(50),
	TypeID int,
	[Date] date,
	[Status] bit,
	PRIMARY KEY(PaperID)
)
GO
INSERT INTO Paper
VALUES (N'Bại tướng thầy Park hé lộ điểm mạnh của Thái Lan, tự tin gieo sầu Việt Nam',N'Việt Tùng',N'Dưới sự dẫn dắt của HLV Gama, U23 Thái Lan đã thua thảm U23 Việt Nam của HLV Park Hang Seo với tỷ số 0-4 ở vòng loại giải U23 châu Á 2020 vào tháng 3/2019. Trận thua lịch sử này cộng với thất bại của U23 Thái Lan ở giải Merlion Cup vào tháng 6/2019 khiến HLV Gama phải ra đi ngay sau đó. Hiện ông Gama đang dẫn dắt Muangthong United, đội bóng của thủ thành Đặng Văn Lâm.','1.jpg', 4, '2019-03-24',1),
(N'Liverpool chờ đại chiến Man City: Chỉ Klopp khiến Pep "ám ảnh" thất bại',N'Tuấn Anh',N'Klopp và Pep gặp nhau 17 lần và Klopp đang thắng 8, Pep thắng 7 trong khi chỉ có 2 trận hòa. Riêng ở Anh, Liverpool là đội đã đánh bại Man City nhiều nhất từ khi Pep cầm quân với 4 thắng lợi, rằng chỉ có Klopp là có phong cách chiến thuật xung khắc theo hướng bất lợi cho Pep. Nhưng Pep Guardiola vẫn ở một đẳng cấp có lẽ khiến ông nên được xem là “trùm cuối” đối với bất cứ HLV nào chứ không chỉ riêng Klopp.
Man City có thể có rất nhiều tiền để mua cầu thủ, nhưng thực tế họ là đội bóng số 1 của bóng đá Anh lúc này vì bộ não của Pep Guardiola. Tư duy của Pep vẫn khiến nhiều người kinh ngạc bởi ông có thể đọc ý đồ của đối thủ rất nhanh chóng chỉ qua việc nhìn danh sách đăng ký thi đấu, và có thể dùng những hình thái chiến thuật không ai dám dùng, hoặc không ai nghĩ ông sẽ dùng, để đạt được thắng lợi.','2.jpg', 4, '2019-03-24',1),
(N'ĐT Việt Nam đại chiến UAE: Thầy Park chốt nhân sự, 5 sao bị loại là ai?',N'Đình Duy',N'Ngày 14/11, ĐT Việt Nam sẽ có trận đấu vô cùng quan trọng với UAE. Trước giờ xuất trận, HLV Park Hang Seo đi đến quyết định chia tay 5 tuyển thủ, rút gọn danh sách triệu tập đội hình.','3.jpg', 4, '2019-03-24',1),
(N'Chelsea thắng như chẻ tre: "Drogba mới" 12 trận chấp MU, Rashford đá cả mùa',N'Bá Dương',N'Tính riêng tại Premier League, Tammy Abraham sở hữu thành tích ghi bàn suýt soát hàng công MU, thậm chí cân bằng thành tích ghi bàn tốt nhất sự nghiệp của Marcus Rashford.','4.jpg', 4, '2019-03-24',1),
(N'Nhận định bóng đá Liverpool - Man City: Xứng danh “Siêu kinh điển” nước Anh',N'Chú heo con',N'(Nhận định bóng đá Liverpool - Man City, 23h30, 10/11, vòng 12 Ngoại hạng Anh) “Độc cô cầu bại” Liverpool sẽ có màn thư hùng nảy lửa với nhà ĐKVĐ Man City. Một cuộc đấu giờ được ví như “Siêu kinh điển” hay derby nước Anh.','5.jpg', 4, '2019-03-24',1),
(N'Đám cưới 10 tỷ của Đông Nhi và Ông Cao Thắng: Lan Ngọc, Lệ Quyên sexy "bung lụa"',N'Tuấn Anh',N'Không chỉ trang phục của cô dâu mà váy áo của khách mời trong lễ cưới của Đông Nhi và Ông Cao Thắng cũng nhận được nhiều quan tâm.','6.jpg', 2, '2019-03-24',0),
(N'Bí quyết vàng giúp quý ông mặc suit đẹp như ý',N'Việt Tùng',N'Muốn đầu tư một lần, mặc suốt đời, bạn nên ưu tiên các thiết kế suit cổ điển, ít lỗi mốt.','7.jpg', 2, '2019-03-24',1),
(N'Mách phái mạnh cách mặc áo phông vẫn lịch sự',N'Tuấn Anh',N'Biến một item đậm chất casual như áo phông trở nên lịch lãm, trang trọng không hề bất khả thi.','8.jpg', 2, '2019-03-24',1),
(N'Quy tắc dùng phụ kiện thời trang cho nam giới',N'Đình Duy',N'Ngoài chức năng xem giờ, đồng hồ đối với nam giới còn là món phụ kiện giúp làm tăng sự phong cách.','9.jpg', 2, '2019-03-24',1),
(N'Vì sao quý ông cần có ít nhất 1 chiếc trench coat trong đời?',N'Bá Dương',N'Đẹp bền bỉ theo thời gian, lại giúp mang lại vẻ nam tính, sang trọng nhất vẫn là các thiết kế trench coat cổ điển.','10.jpg', 2, '2019-03-24',1),
(N'Chảy nước miếng với 12 món bánh pancake "ngon chết người"',N'Chú heo con',N'Bạn sẽ không thể nào cưỡng lại được những chiếc bánh cực kỳ ngon mắt như thế này.','11.jpg', 3, '2019-03-24',1),
(N'Chiêm ngưỡng những món ăn cực kỳ dễ thương và ngộ nghĩnh (P.1)',N'Việt Tùng',N'Tiếp tục là những món ăn do các đầu bếp Nhật Bản chế biến, chúng sẽ mang lại cho bạn cảm giác "nhìn mà không nỡ ăn vì quá đẹp mắt".','12.jpg', 3, '2019-03-24',1),
(N'Chùm ảnh ấn tượng của những món ăn bị cắt làm đôi',N'Tuấn Anh',N'Một cách không thể thú vị hơn để khám phá phía bên trong của những món ăn thường ngày.','13.jpg', 3, '2019-03-24',1),
(N'19 chiếc bánh cưới "độc nhất vô nhị" dựa trên các tác phẩm nổi tiếng',N'Đình Duy',N'Những người thích xem phim hoặc hay chơi trò chơi điện tử chắc hẳn sẽ không lạ lẫm gì với những chiếc bánh cưới độc đáo này.','14.jpg', 3, '2019-03-24',1),
(N'Tổng hợp 20 chiếc bánh cupcake với cách trang trí độc đáo',N'Bá Dương',N'Những chiếc bánh cupcake vừa ngon lại còn được trang trí cầu kỳ khiến cho mọi người chỉ muốn được thưởng thức chúng ngay lập tức.','15.jpg', 3, '2019-03-24',1);

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
(1,2,'2019-03-24'),
(1,3,'2019-03-24'),
(1,4,'2019-03-24'),
(1,5,'2019-03-24'),
(1,6,'2019-03-24'),
(1,7,'2019-03-24'),
(1,8,'2019-03-24'),
(1,9,'2019-03-24'),
(1,11,'2019-03-24'),
(2,1,'2019-03-24'),
(2,2,'2019-03-24'),
(2,3,'2019-03-24'),
(4,4,'2019-03-24'),
(5,5,'2019-03-24'),
(1,15,'2019-03-24'),
(2,7,'2019-03-24'),
(2,9,'2019-03-24'),
(1,10,'2019-03-24'),
(2,11,'2019-03-24'),
(4,6,'2019-03-24'),
(5,7,'2019-03-24'),
(3,8,'2019-03-24'),
(4,9,'2019-03-24'),
(3,10,'2019-03-24'),
(4,11,'2019-03-24');

GO

GO
CREATE TABLE Comment(
	UserID int,
	PaperID int,
	[Content Comment] ntext,
	[Date comment] date,
	
)
GO
INSERT INTO Comment
VALUES (1,1,N'hay quá','2019-01-01'),
(1,2,N'hay quá','2019-01-01'),
(1,3,N'hay quá','2019-01-01'),
(1,4,N'hay quá','2019-01-01'),
(1,5,N'hay quá','2019-01-01'),
(1,6,N'hay quá','2019-01-01'),
(2,1,N'hay quá','2019-01-01'),
(2,2,N'hay quá','2019-01-01'),
(2,3,N'hay quá','2019-01-01'),
(2,4,N'hay quá','2019-01-01'),
(2,5,N'hay quá','2019-01-01'),
(2,6,N'hay quá','2019-01-01'),
(1,1,N'hay quá','2019-01-01'),
(1,2,N'hay quá','2019-01-01'),
(2,3,N'hay quá','2019-01-01'),
(2,4,N'hay quá','2019-01-01'),
(2,5,N'hay quá','2019-01-01'),
(1,3,N'hay quá','2019-01-01'),
(1,4,N'hay quá','2019-01-01'),
(1,6,N'hay quá','2019-01-01'),
(1,5,N'hay quá','2019-01-01'),
(1,6,N'hay quá','2019-01-01'),
(1,7,N'hay quá','2019-01-01'),
(1,14,N'hay quá','2019-01-01'),
(1,15,N'hay quá','2019-01-01'),
(1,3,N'hay quá','2019-01-01'),
(1,5,N'hay quá','2019-01-01'),
(1,7,N'hay quá','2019-01-01'),
(1,12,N'hay quá','2019-01-01');
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
  GO


















