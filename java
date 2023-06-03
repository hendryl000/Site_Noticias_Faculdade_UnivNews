            var balls = document.querySelector(".balls")
            var quant = document.querySelectorAll(".imagem img")
            var atual = 0
            var imagem = document.getElementById("atual")
            var next = document.getElementById("next")
            var voltar = document.getElementById("voltar")

            for(let i=0; i< quant.length; i++){
                var div = document.createElement("bnt")
                div.id = i
                balls.appendChild(div)
            }
            document.getElementById("0").classList.add(".imgatual")

            var pos = document.querySelectorAll(".balls div")

            for(let i=0; i< quant.length; i++){
                pos[i].addEventListener('click',()=>{
                atual = pos[i].id
                slide()
            })
            }

            voltar.addEventListener('click', ()=>{
                atual--
                slide()
            })

            next.addEventListener('click', ()=>{
                atual++
                slide()
            })

            function slide(){
                if (atual >= quant.length){
                    atual = 0
                }
                else if(atual < 0){
                    atual = quant.length-1
                }
                document.querySelector(".imgatual").classList.remove("imgatual")
                imagem.style.marginLeft = -1024*atual+'px'
                document.getElementById(atual).classList.add("imgatual")
            }