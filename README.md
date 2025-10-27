# 🧩 MOIDA - 관심사 기반 모임 플랫폼

> **세미프로젝트 | 팀 MOIDA**  
> 담당 역할: **공지사항 게시판 및 문의·답변(대댓글) 기능 개발**

[![Deploy](https://img.shields.io/badge/Demo-Live-green)](https://moida-spring-boot.onrender.com)

---

## 👋 소개

안녕하세요, **이기정**입니다.  
저는 이번 세미프로젝트 **MOIDA**에서  
“**공지사항 게시판과 문의/답변(대댓글)** 기능”을 맡아 개발했습니다.

단단한 기본기에 충실한 **CRUD 게시판 구조**를 기반으로,  
사용자들이 소통하고 궁금증을 해결할 수 있는 **Q&A 시스템**을 설계·구현했습니다. 😄

---

## 🖥️ 프로젝트 개요

| 항목 | 내용 |
|------|------|
| **프로젝트명** | MOIDA |
| **프로젝트 유형** | 세미프로젝트 (Spring Boot 기반 웹 플랫폼) |
| **주제** | 관심사 기반 모임 생성 및 참가 플랫폼 |
| **참여 인원** | 4명 |
| **담당 기능** | 공지사항 게시판 / 문의-답변(대댓글) 기능 |

---

## 🎯 기획 의도

현대 사회에서는 다양한 취향과 관심사를 공유하고 싶지만,  
그에 맞는 모임을 쉽게 찾거나 직접 개설하기 어려운 문제가 있습니다.  

**MOIDA**는 이러한 불편함을 해소하기 위해  
누구나 쉽게 모임을 개설하고, 참가자 간에 소통할 수 있는 공간을 제공합니다.

- 관심사 기반 모임 생성 및 관리  
- 참가자 간 소통(Q&A, 리뷰) 기능  
- 모바일 친화적인 반응형 디자인  

---

## ⚙️ 기술 스택

| 구분 | 기술 |
|------|------|
| **Language** | Java 17 |
| **Framework** | Spring Boot (MVC) |
| **View Template** | Thymeleaf |
| **Database** | Oracle 18c (Docker / AWS EC2) |
| **ORM / Mapper** | MyBatis |
| **Security** | Spring Security, BCrypt |
| **Storage** | AWS S3 (이미지 업로드) |
| **Build Tool** | Gradle |
| **Deploy** | Render.com (Docker 컨테이너) |
| **IDE / Tool** | IntelliJ, VSCode, STS |
| **Version Control** | Git, GitHub |

---

## 📸 주요 화면

### 🏠 메인 페이지
<img width="1391" height="740" alt="image" src="https://github.com/user-attachments/assets/0557ce1c-c1f4-42ea-aaef-ce96ef58920e" />

### 💬 대댓글 (문의·답변 기능)
<img width="1215" height="695" alt="image" src="https://github.com/user-attachments/assets/2fb6b2c8-0cfc-40a1-bddc-4276c8011877" />

### ❓ 문의 페이지
<img width="1186" height="638" alt="image" src="https://github.com/user-attachments/assets/f624788b-5837-49cc-887f-c79aaf3e4185" />

### 🗃️ ERD
<img width="1690" height="912" alt="모이다ERD" src="https://github.com/user-attachments/assets/7ba58f87-59f5-426c-ae9e-680d52e4d030" />

---

## 🔧 담당 기능 상세

### 🗨️ 1. 문의 & 답변 (대댓글 구조)
- 부모 댓글과 자식 댓글 간의 계층형 구조 설계  
- **문의글 → 관리자가 답변 작성** 시 자동 연결  
- **대댓글 등록, 수정, 삭제** 기능 구현  
- 답변 작성 후 실시간 새로고침 반영 (Thymeleaf form 기반)  

**주요 포인트**
- `parent_id` 컬럼을 이용해 트리 구조 저장  
- `@OneToMany`, `@ManyToOne` 관계 매핑  
- 서비스 계층에서 재귀적 댓글 로드 로직 구현  

---

### 📢 2. 공지사항 게시판
- 관리자 전용 공지 작성 / 수정 / 삭제 기능  
- 일반 사용자 공지사항 조회 기능  
- 중요 공지는 상단 고정 (Pin 기능)  

**주요 포인트**
- **Spring MVC + MyBatis** 기반 CRUD  
- 페이지네이션 처리 (`RowBounds`)  
- 등록일순 정렬 및 공지 우선순위 노출  

---

## 🧱 ERD 핵심 구조

- **User**: 회원 정보, 권한 관리  
- **Post**: 모임 정보  
- **Comment**: 문의 / 답변 관계 (self-join 구조)  
- **Notice**: 공지사항 게시판  
- **File**: S3 업로드 파일 관리  

---

## 🚀 배포 및 운영 환경

- **Docker** 기반으로 패키징하여 **Render.com**에 자동 배포  
- **AWS EC2**에서 Oracle DB 운영  
- **AWS S3**를 통한 이미지 업로드 및 접근 URL 관리  

---

## 🧠 개발하며 느낀 점

> “**단순한 CRUD가 프로젝트의 기초 체력을 만든다.**”

이번 프로젝트에서는 게시판 구조와 대댓글 관계를 직접 설계하고,  
엔티티 간 관계를 명확히 하면서 ORM의 동작 원리를 체감할 수 있었습니다.  

특히 대댓글 기능 구현을 통해 **계층형 데이터 처리**와  
**서비스-컨트롤러 간 책임 분리**의 중요성을 배웠습니다.

---

## 📎 링크

- 🔗 **Live Demo:** [https://moida-spring-boot.onrender.com](https://moida-spring-boot.onrender.com)  
- 💻 **GitHub Repository:** [https://github.com/your-repo/moida](https://github.com/your-repo/moida)

---

## 🧑‍💻 팀 구성

| 이름 | 역할 | 담당 기능 |
|------|------|------------|
| 이기정 | 백엔드 | 공지사항, 문의/답변(대댓글) |
| A | 프론트엔드 | 메인 UI, 모임 리스트 |
| B | 백엔드 | 모임 관리, 참가 기능 |
| C | 풀스택 | 회원가입/로그인, 리뷰 시스템 |

---

## 🏁 향후 개선 계획

- AJAX 기반 비동기 댓글 등록 (새로고침 없이 반영)  
- 문의·답변 알림 기능 (이메일 / 알림톡 연동)  
- 관리자 페이지 통합 대시보드  

---

> **단단한 기본기 위에 확장성 있는 구조를 설계하는 개발자, 이기정입니다.**
