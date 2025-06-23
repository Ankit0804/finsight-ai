# FinsightAI
 A predictive personal and small-business finance platform using React, Spring Boot, PostgreSQL, and AWS. Designed and integrated an AI microservice for cash flow forecasting and anomaly detection. Architected with Docker and deployed on Kubernetes (EKS), with RESTful APIs and a modular frontend for analytics, alerting, and reporting.


FinSight AI is a personal finance management platform powered by artificial intelligence. It helps users make smarter financial decisions by offering insights, forecasts, and automation. Here's a breakdown of what it does and how it solves real-world problems:

🧠 What Is FinSight AI?
FinSight AI is a web-based application that enables individuals to:

Upload their financial transaction data (e.g. bank statements, spending logs)

View intuitive dashboards summarizing their financial health

Get AI-based predictions of future spending and cash flow

Set alerts for overspending

Generate PDF financial reports

Store and manage financial documents securely

🎯 What Problem Does It Solve?
Modern users often:

Lack clear visibility into their day-to-day expenses

Don’t know how much they’re likely to spend in the future

Miss warning signs for budget overruns

Want to understand spending patterns for better planning

FinSight AI addresses these issues by automating financial tracking, giving users intelligent forecasts, and enabling informed decisions.

🔑 Core Features
Feature	Description
CSV Upload	Upload bank/exported transaction history.
Data Summary	Auto-categorization of expenses, income vs expenses analysis.
Spending Visualizations	Charts for monthly cash flow, category-wise spending.
30-Day Forecast	AI (ML model) predicts upcoming cash flow using past data.
Spending Alerts	Get emails if predicted or actual spend crosses thresholds.
Report Generation	Export financial summary as PDF.
Document Storage	Upload bills, receipts to AWS S3 for archival.
Secure Backend	JWT-based authentication with user-specific data access.

🧰 Tech Stack
Frontend: React.js

Backend: Spring Boot (REST APIs)

ML Microservice: FastAPI + Python

Databases: PostgreSQL (for structured data), MongoDB (for logs/snapshots)

Cloud: AWS (EKS, RDS, S3, SES)

Containerization: Docker + Kubernetes

🧑‍💼 Real-World Impact
Used by freelancers, solopreneurs, and anyone with multiple income/expense sources.

Adaptable for small businesses to visualize and manage finances.

Can be extended for tax filing, credit scoring, or even integration with fintech APIs.
