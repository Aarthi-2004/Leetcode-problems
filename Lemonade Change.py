class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        count5 = 0  # Count of $5 bills
        count10 = 0  # Count of $10 bills

        # Process each bill in the queue
        for bill in bills:
            if bill == 5:  # If the customer pays $5
                count5 += 1  # Keep the $5 bill as no change is needed
            elif bill == 10:  # If the customer pays $10
                count5 -= 1  # Give $5 as change
                count10 += 1  # Keep the $10 bill
            else:  # If the customer pays $20
                if count10 > 0:  # Prefer giving one $10 and one $5 as change
                    count10 -= 1
                    count5 -= 1
                else:  # Otherwise, give three $5 bills as change
                    count5 -= 3
            
            # If at any point, we don't have enough $5 bills for change
            if count5 < 0:
                return False

        # If all customers are served with correct change, return True
        return True
