class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        """The way to think about it is since it's 3 sum, there's only going to be 3 numbers. So to find the combinations of 3 numbers, he is iterating through the list with the first pointer, and then trying to find two extra numbers to sum to 0. Since the list is ordered, the right pointer will always be higher than the middle pointer. So if the sum is too large, you can move the right pointer back one. On the other hand, if the sum is too small (below 0), then move the middle pointer up one."""
        nums.sort()
        result = []
        for left in range(len(nums) - 2): # renamed this to left because this will always be the leftmost pointer in the triplet
            if left > 0 and nums[left] == nums[left - 1]: # this step makes sure that we do not have any duplicates in our result output
                """len(nums)-2 is because we need at least 3 numbers to continue.
if left > 0 and nums[left] == nums[left-1] is because when left = 0, it doesn't need to check if it's a duplicate element since it doesn't even have a previous element to compare with. And nums[left] == nums[left-1] is to prevent checking duplicate again. (This seems to be a good pattern which has been seen in other questions as well)."""
                continue 
            mid = left + 1 # renamed this to mid because this is the pointer that is between the left and right pointers
            right = len(nums) - 1
            while mid < right:
                curr_sum = nums[left] + nums[mid] + nums[right]
                if curr_sum < 0:
                    mid += 1 
                elif curr_sum > 0:
                    right -= 1
                else:
                    result.append([nums[left], nums[mid], nums[right]])
                    while mid < right and nums[mid] == nums[mid + 1]: # Another conditional for not calculating duplicates
                        mid += 1
                    while mid < right and nums[right] == nums[right - 1]: # Avoiding duplicates check
                        right -= 1
                    mid += 1
                    right -= 1
        return result

        