# A simple reverse cipher program
# Deepti Sharma 17th April , 2021 7:38 PM

message=raw_input("Enter the message to reverse ciphered")
print "The original message is ",message
print "\n"
mes_len=len(message)-1
translated=''
while mes_len>=0:
	translated=translated+message[mes_len]
	mes_len=mes_len-1
print "The reverse encrypted message is", translated


###### Reversing th encrypted message will give the original message again.
