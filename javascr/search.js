<html>
    <head><title>Array</title></head>
    <body>
        <script>
        function start()
        {
            var array1 = [[1,2,3],
                            [4,5,6]];
            var array2 = [[1,2,3],
                           [1],
                            [4,5,6]];

            outputArray("Values in array1 by row",array1,document.getElementsById("output1"));
            outputArray("Values in array2 by row",array2,document.getElementsById("output1"));
        } //end function start

        //display array contents 
        function outputArray(heading, theArray, output)
        {
            var results = "";
            //iterates through the set of onne dimensional arrays
            for (var row in theArray)
            {
                results += "<ol>";

                    //iterates through the elements of each one dimensional array
                    for (var column in theArray[row])
                    {
                        results += "<li>" + theArray[row][column] + "</li>";

                    }

                    results += "<ol>" ;
            }
        }
        </script>
        
    </body>
</html>