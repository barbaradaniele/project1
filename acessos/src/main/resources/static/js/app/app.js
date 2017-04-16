var app = angular.module('acessoApp',['ui.router','ngStorage']);

app.constant('urls', {
    BASE: 'http://localhost:8080/AcessoWS',
    USER_SERVICE_API : 'http://localhost:8080/AcessoWS/api/acessos/'
});

app.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {

        $stateProvider
            .state('home', {
                url: '/',
                templateUrl: 'partials/list',
                controller:'PessoaController',
                controllerAs:'ctrl',
                resolve: {
                    users: function ($q, PessoaService) {
                        console.log('Load all acess');
                        var deferred = $q.defer();
                        PessoaService.loadAllPessoas().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            });
        $urlRouterProvider.otherwise('/');
    }]);

