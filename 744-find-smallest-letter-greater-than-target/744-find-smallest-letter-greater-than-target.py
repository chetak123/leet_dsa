class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        star=0
        end=len(letters)-1
        while(star<=end):
            mid=star+(end-star)//2
            if (letters[mid]>target):
                end=mid-1
            else:
                star=mid+1
        return(letters[star%len(letters)])
        # here % is used for condition when start is greater than end
        # then this makes letter[0]
        