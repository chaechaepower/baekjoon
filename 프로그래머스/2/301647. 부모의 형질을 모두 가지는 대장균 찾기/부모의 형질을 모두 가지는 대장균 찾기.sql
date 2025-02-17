-- 자식의 ECOLI_DATA과 부모의 ECOLI_DATA을 & 했을 때 1이 나와야함.
-- A.ID= B.PARENT_ID, A.ID -> 부모, B.ID -> 자식


                   
                   
SELECT B.ID AS ID, B.GENOTYPE, A.GENOTYPE AS PARENT_GENOTYPE
FROM ECOLI_DATA A
    JOIN ECOLI_DATA B
    ON A.ID=B.PARENT_ID
WHERE B.GENOTYPE & A.GENOTYPE = A.GENOTYPE
ORDER BY ID