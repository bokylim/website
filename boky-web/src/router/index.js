import Vue from 'vue'
import VueRouter from 'vue-router'

import MainView from "@/components/view/MainView.vue";
import BoardView from "@/components/view/BoardView.vue";

Vue.use(VueRouter)

const routes = [
  {
    path: "/",
    name: "MainView",
    component: MainView,
  },{
    path: "/board",
    name: "BoardView",
    component: BoardView,
  },
  
]

const router = new VueRouter({
    mode: "history",
    base: process.env.BASE_URL,
    routes,
})

export default router