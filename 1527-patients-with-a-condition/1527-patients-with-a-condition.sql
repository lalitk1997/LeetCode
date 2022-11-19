# Write your MySQL query statement below

SELECT * FROM Patients WHERE
conditions LIKE '% DIAB1%' OR
conditions LIKE 'DIAB1%';

# ( SELECT 
#   SUBSTRING_INDEX(conditions,' ', 1) AS first_code, 
#   SUBSTRING_INDEX(conditions,' ', -1) AS sec_code,
#   patient_id,
#   patient_name,
#   conditions
# FROM Patients )

# SELECT T.patients_id, T.patient_name, T.conditions 
# ( SELECT 
#   SUBSTRING_INDEX(conditions,' ', 1) AS first_code, 
#   SUBSTRING_INDEX(conditions,' ', 1) AS sec_code,
#   patient_id,
#   patient_name,
#   conditions
# FROM Patients ) AS T
# WHERE T.first_code LIKE 'DIAB1%' OR T.sec_code LIKE 'DIAB1%';
