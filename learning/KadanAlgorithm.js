// function kadans(arr) {
//   let cs = 0
//   let ms = -Infinity
//   for (let num of arr) {
//     cs += num
//     if (cs < 0) {
//       cs = 0
//     }
//     ms = Math.max(ms, cs)
//   }
//   return ms
// }
// let arr = [-2, -3, 4, -1, -2, 1, 5, -3]
// console.log(kadans(arr))

function kadansAlgo(arr) {
  let cs = 0
  let ms = -Infinity
  for (let num of arr) {
    cs += num
    if (cs < 0) {
      cs = 0
    }
    ms = Math.max(cs, ms)
  }
  return ms
}

let arr = [-2, -3, 4, -1, -2, 1, 5, -4]
console.log(kadansAlgo(arr))
