function calculate(n1,n2,op)
{
    if(op=="+")
    {
        let rs=parseInt(n1)+parseInt(n2)
        let r=Number(n1)+Number(n2)
        //return rs
        return r
    }
    else if(op=="-")
    {
        return (n1-n2)
    }
    else if(op=="/")
    {
        return (n1/n2)
    }
    else if(op=="*")
    {
        return (n1*n2)
    }
}