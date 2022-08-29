# By submitting this assignment, I agree to the following:
#   "Aggies do not lie, cheat, or steal, or tolerate those who do."
#   "I have not given or received any unauthorized aid on this assignment."
#
# Name:         Clint Hart
# Section:      208 
# Assignment:   Lab 9b-3
# Date:         12 11 2021
#
myfile = open("CLLWeatherData.csv", "r")
data = list(myfile)
myfile.close()
maxT = -10000
minT = 10000
totalPre = 0
for i in data[1:]:
    p = i.split(",")
    if int(p[-2])>maxT:
        maxT = int(p[-2])
    if int(p[-1])<minT:
        minT = int(p[-1])
    totalPre += float(p[2])
print("3-year maximum temperature: {} F".format(maxT))
print("3-year minimum temperature: {} F".format(minT))
print("3-year average precipitation: {:.3f} inches".format(totalPre/(len(data)-1)))
print()
mon = input("Please enter a month: ")
year = int(input("Please enter a year: "))
print()
print("For {} {}:".format(mon,year))
count = 0
temp = 0
#number of days with average wind speed above 10 
wind = 0
pre = 0
months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"]
#print(months.index(mon)+1)
for i in data[1:]:
    p = i.split(",")
    #print(int(p[0].split("/")[0])==months.index(mon)+1)
    #print(int(p[0].split("/")[2])==year)
    if int(p[0].split("/")[0])==months.index(mon)+1 and int(p[0].split("/")[2])==year:
        count += 1
        temp += int(p[-3])
        if float(p[1])>10:
            wind+=1
        pre += float(p[2])
if count != 0:
    print("Mean daily temperature: {:.1f} F".format(temp/count))
    print("Percentage of days with average wind speed above 10 mph: {:.1f}%".format(100*wind/count))
    print("Mean daily precipitation: {:.4f} inches".format(pre/count))

