SELECT ROUND((SUM(DAILY_FEE) / COUNT(*)), 0) AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV'