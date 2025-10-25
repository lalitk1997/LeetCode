class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        mpp = {"I": 1,"V": 5,"X": 10,"L": 50,"C": 100,"D": 500,"M": 1000,"IV": 4,"IX": 9,"XL": 40,"XC": 90,"CD": 400,"CM": 900}
        sum=0
        mpp2={"IV": 2,"IX": 2,"XL": 20,"XC": 20,"CD": 200,"CM": 200}
        for i in s:
            if i in mpp.keys():
                sum+=mpp[i]
        for i in mpp2.keys():
            if i in s:
                sum-=mpp2[i]
        return sum