var exec = require('cordova/exec');

module.exports.addMethod = function (arg0, success, error) {
    exec(success, error, 'SimpleCalculator', 'addMethod', [arg0]);
};
module.exports.subMethod = function (arg0, success, error) {
    exec(success, error, 'SimpleCalculator', 'subMethod', [arg0]);
};
module.exports.mulMethod = function (arg0, success, error) {
    exec(success, error, 'SimpleCalculator', 'mulMethod', [arg0]);
};
module.exports.divMethod = function (arg0, success, error) {
    exec(success, error, 'SimpleCalculator', 'divMethod', [arg0]);
};
// exports.coolMethod = function (arg0, success, error) {
//     exec(success, error, 'SimpleCalculator', 'coolMethod', [arg0]);
// };
