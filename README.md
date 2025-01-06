# Final Project _ DevOps 17
DỰ ÁN: TRIỂN KHAI CI/CD CHO ỨNG DỤNG JAVA WEB

1. Kiến trúc tổng thể:
![image](https://github.com/user-attachments/assets/f9390d28-ae13-42be-b972-02d91cb8c5d8)
  
3. Các bước thực hiện:
   
Bước 1 — Khởi chạy Ubuntu AWS T2 Large Instance. Enable HTTP và HTTPS settings trong Security Group

Bước 2 — Cài đặt Jenkins, Docker và Trivy. Tạo Sonarqube Container bằng Docker.

Bước 3 — Thiết lập email với plugin

Bước 4 —  Cài đặt plugin trong Jenkins. Cài đặt các Plugin như JDK, Sonarqube Scanner, Maven, OWASP Dependency Check…

Bước 5 — Thiết lập Sonarqube bằng token và webhook.

Bước 6 — Thêm các công cụ như Java, Maven, Owasp và Sonar trong jenkins

Bước 7  — Cấu hình Sonar

Bước 8 — Tạo Pipeline Project trong Jenkins bằng Declarative Pipeline

Bước 9 — Thực hiện OWASP Dependency Check

Bước 10 — Cài đặt plugin docker và thiết lập thông tin xác thực. Sau đó Build Docker Image

Bước 11 — Thực hiện Trivy và deploy container

Bước 12—  Cài đặt Tomcat và triển khai trên Apache Tomcat cho giai đoạn pipeline

Bước 13 — Phê duyệt thủ công trên CICD Pipeline

Bước 14 —  Khởi chạy Kubernetes. Cài đặt và thiết lập Kubernetes.

Bước 15 —  Chạy pipelines thành công. Nhận email pipeline success với Trivy report

Bước 16 —  Monitoring: Thiết lập cấu hình prometheus exporter cho Jenkins (sử dụng prometheus plugin) và triển khai grafana dashboard.

Bước 17 —  Kết thúc AWS EC2 Instance
