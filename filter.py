myfile = open("titles2.csv", "r")
file2 = open("titles.csv", "w")
for line in myfile:
    l = line.split(",")
    if (l[1]=="movie"):
        file2.write(line)