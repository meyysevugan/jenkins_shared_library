def call(Map val){
    node {
        echo "Value1 in map: ${val.val1}"
        echo "Value2 in map: ${val.val2}"
    }
}