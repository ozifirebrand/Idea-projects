<template>
  <input type="text" id="input-quantity" placeholder="Quantity">
  <div>{{selected}}</div>
  <select v-model="selected">
    <option disabled value="">Size</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
    <option>5</option>
  </select>
  <div id="price">{{priceComputed}}
  </div>

  <div>
    <button type="submit">Make Order</button>
  </div>
</template>

<script>
export default {
  data(){
    return{
      quantity:0,
      selected:""
    }
  },
  priceComputed(){
      return this.selected * this.quantity
  },
  name: "PrinterFront"
}
</script>

<style scoped>

</style>