import Vue from 'vue'
import App from './App.vue'
// import store from "./store"
import router from "./router"
Vue.config.productionTip = false

import "@/css/font.css";
import "@/css/common.css"

import MainHeader from './components/common/MainHeader.vue'


Vue.component('MainHeader', MainHeader)  // 글로벌 컴포넌트


new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
