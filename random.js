function random() {
    let seed = Date.now();
    const a = 1664525;
    const c = 1013904223;
    const m = Math.pow(2, 32);

    seed = (a * seed + c) % m;
    return seed / m;
}
console.log(random());
