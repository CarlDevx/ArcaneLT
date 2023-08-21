var main_div = document.getElementById("content");
        function buttonHandle(value){
           if (value === 0){
               let iframe = document.createElement("iframe");
               iframe.src = "https://www.instagram.com/";
               iframe.width = "320";
               iframe.height = "460";
               main_div.removeChild(document.getElementById("btn"));
               main_div.appendChild(iframe);
           }
           else{
               alert('outro bp');
           }
        }
